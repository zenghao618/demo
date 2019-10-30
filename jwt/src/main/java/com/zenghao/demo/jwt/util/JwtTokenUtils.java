package com.zenghao.demo.jwt.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: JwtTokenUtils
 * Description: JwtToken生成的工具类
 * JWT格式：header.patload.signature
 * header格式（算法，token的类型）： {"alg": "HS512","typ": "JWT"}
 * payload的格式（iss:发行人，exp：到期时间，subL主题，aud：用户，nbf：生效时间，iat：发布时间，jti：JWT ID）
 * signature的生成算法：HMACSHA256(base64UrlEncode(header) + "." + base64UrlEncode(payload),secret)
 *
 * date: 2019/10/30 13:50
 *
 * @author 小皓皓
 * @version 1.0
 * @since JDK 1.8
 */
@Component
public class JwtTokenUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtils.class);
    /**
     * JWT添加到HTTP HEAD的属性名
     */
    public static final String TOKEN_HEADER = "Authorization";
    /**
     * JWT 添加至HTTP HEAD中的前缀
     */
    public static final String TOKEN_PREFIX = "Bearer ";

    /**
     * 存储在服务端的密钥，在application.yml配置
     */
    @Value("${jwt.secret}")
    private String secret;

    /**
     * 默认的JWT过期时间，在application.yml中配置
     */
    @Value("${jwt.expiration}")
    private Long expiration;

    /**
     * jwt有效载荷中用户名
     */
    private static final String CLAIM_KEY_USERNAME = "sub";
    /**
     * jwt有效载荷中生成时间
     */
    private static final String CLAIM_KEY_CREATED = "created";

    /**
     * JWT 加解密算法
     */
    private static final SignatureAlgorithm JWT_ALG = SignatureAlgorithm.HS512;

    private static final String TYPE = "JWT";

    /**
     * 根据用户信息生成token
     */
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME, userDetails.getUsername());
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }

    /**
     * 验证token是否还有效
     *
     * @param token       客户端传入的token
     * @param userDetails 从数据库中查询出来的用户信息
     */
    public boolean validateToken(String token, UserDetails userDetails) {
        String username = getUserNameFromToken(token);
        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
    }

    /**
     * 从token中获取登录用户名
     */
    public String getUserNameFromToken(String token) {
        String username;
        try {
            Claims claims = getClaimsFromToken(token);
            username =  claims.getSubject();
        } catch (Exception e) {
            username = null;
        }
        return username;
    }

    /**
     * 判断token是否可以被刷新
     */
    public boolean canRefresh(String token) {
        return !isTokenExpired(token);
    }

    /**
     * 刷新token
     */
    public String refreshToken(String token) {
        Claims claims = getClaimsFromToken(token);
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }

    /**
     * 根据负载生成JWT的token
     */
    private String generateToken(Map<String, Object> claims) {
        Map<String,Object> head = new HashMap<>();
        head.put("alg",JWT_ALG);
        head.put("type",TYPE);
        return Jwts.builder()
                .setHeader(head)
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(JWT_ALG, secret)
                .compact();
    }

    /**
     * 生成token的过期时间
     */
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration * 1000);
    }

    /**
     * 从token中获取JWT中的负载
     */
    private Claims getClaimsFromToken(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            LOGGER.info("JWT格式验证失败:{}",token);
        }
        return claims;
    }

    /**
     * 从token中获取过期时间
     */
    private Date getExpiredDateFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return claims.getExpiration();
    }

    /**
     * 判断token是否已经失效
     */
    private boolean isTokenExpired(String token) {
        Date expiredDate = getExpiredDateFromToken(token);
        return expiredDate.before(new Date());
    }


}
