package com.mall.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author houqj
 * @date 2020-01-07 14:37
 */
@MapperScan("com.mall.*.mapper")
@SpringBootApplication
public class MallUmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallUmsApplication.class);
    }
}
