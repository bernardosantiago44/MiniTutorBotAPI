package com.tutorbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TutorbotApplication {

    public static void main(String[] args) {
        SpringApplication.run(TutorbotApplication.class, args);
    }
}
