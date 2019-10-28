package com.zenghao.demo.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MybatisConfig
 * Description: 配置mapper接口的扫描路径
 * date: 2019/10/26 21:20
 *
 * @author 小皓皓
 * @version 1.0
 * @since JDK 1.8
 */
@Configuration
@MapperScan({"",""})
public class MybatisConfig {
}
