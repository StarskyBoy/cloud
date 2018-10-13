package com.midou.cloud.register.gateway.zuul.filter;

import com.midou.cloud.register.gateway.zuul.filter.filter.PreRequestLogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class RegisterGatewayZuulFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterGatewayZuulFilterApplication.class, args);
	}

	@Bean
	public PreRequestLogFilter preRequestLogFilter()
	{
		return new PreRequestLogFilter();
	}
}
