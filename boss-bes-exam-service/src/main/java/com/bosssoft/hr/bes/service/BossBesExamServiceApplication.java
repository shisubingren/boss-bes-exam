package com.bosssoft.hr.bes.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan
@SpringBootApplication
public class BossBesExamServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BossBesExamServiceApplication.class, args);
    }

}
