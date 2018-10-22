package com.midou.cloud.register.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class RegisterGatewayZuulFallbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterGatewayZuulFallbackApplication.class, args);
	}
}
