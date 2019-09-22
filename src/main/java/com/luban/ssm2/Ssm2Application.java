package com.luban.ssm2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement//事务管理器
@SpringBootApplication
public class Ssm2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ssm2Application.class, args);
    }

}
