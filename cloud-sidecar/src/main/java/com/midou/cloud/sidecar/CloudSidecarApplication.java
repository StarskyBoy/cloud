package com.midou.cloud.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@EnableSidecar
@SpringBootApplication
public class CloudSidecarApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudSidecarApplication.class, args);
    }
}
