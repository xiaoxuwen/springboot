package com.hust.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootCacaheDataWithSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCacaheDataWithSpringApplication.class, args);
    }
}
