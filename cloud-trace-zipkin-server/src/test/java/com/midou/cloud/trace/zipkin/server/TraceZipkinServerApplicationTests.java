package com.midou.cloud.trace.zipkin.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.test.context.junit4.SpringRunner;

@EnableEurekaClient
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RunWith(SpringRunner.class)
@SpringBootTest
public class TraceZipkinServerApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("hello world");
	}

}
