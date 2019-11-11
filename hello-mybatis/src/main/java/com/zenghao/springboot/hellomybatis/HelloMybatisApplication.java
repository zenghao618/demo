package com.zenghao.springboot.hellomybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zenghao.springboot.hellomybatis.mapper")
public class HelloMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloMybatisApplication.class, args);
    }

}
