package com.mall.admin;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.annotation.PostConstruct;

/**
 * @author houqj
 * @date 2020-01-07 14:37
 */
@EnableAsync
@MapperScan("com.mall.*.mapper")
@SpringBootApplication
public class MallAdminApplication{
    public static void main(String[] args) {
        SpringApplication.run(MallAdminApplication.class);
    }
}
