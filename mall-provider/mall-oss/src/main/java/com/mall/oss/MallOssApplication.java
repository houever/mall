package com.mall.oss;

import cn.fast.web.mybatisplus.MybatisPlusConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class, MybatisPlusConfig.class})
public class MallOssApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallOssApplication.class);
    }
}
