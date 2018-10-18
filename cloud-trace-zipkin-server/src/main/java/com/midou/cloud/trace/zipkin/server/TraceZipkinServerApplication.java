package com.midou.cloud.trace.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class TraceZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraceZipkinServerApplication.class, args);
	}
}
