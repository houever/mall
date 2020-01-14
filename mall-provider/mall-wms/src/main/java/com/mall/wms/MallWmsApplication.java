package com.mall.wms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author houqj
 * @date 2020-01-07 14:37
 */
@MapperScan("com.mall.*.mapper")
@SpringBootApplication
public class MallWmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallWmsApplication.class);
    }
}
