package com.epex.koinbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KoinbotApplication {

    public static void main(String[] args) {
        SpringApplication.run(KoinbotApplication.class, args);
    }

}
