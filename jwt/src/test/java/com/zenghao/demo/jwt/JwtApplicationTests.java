package com.zenghao.demo.jwt;

import com.zenghao.demo.jwt.dto.AdminUserDetails;
import com.zenghao.demo.jwt.model.UmsAdmin;
import com.zenghao.demo.jwt.model.UmsPermission;
import com.zenghao.demo.jwt.util.JwtTokenUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class JwtApplicationTests {
    @Autowired
    private JwtTokenUtils utils;

    @Test
    void contextLoads() {
        UmsAdmin umsAdmin = new UmsAdmin();
        umsAdmin.setUsername("zenghao");
        List<UmsPermission> list = new ArrayList<>();
        AdminUserDetails details = new AdminUserDetails(umsAdmin,list);
        String jwt = utils.generateToken(details);
        System.out.println(jwt);
    }

}
