package com.wxcmybaits.mybaits_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class MybaitsExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybaitsExampleApplication.class, args);
    }

}
