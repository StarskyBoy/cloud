package com.midou.cloud.file.upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RegisterFileUploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegisterFileUploadApplication.class, args);
    }
}
