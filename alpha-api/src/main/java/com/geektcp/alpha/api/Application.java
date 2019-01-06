package com.geektcp.alpha.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan("com.geektcp")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}