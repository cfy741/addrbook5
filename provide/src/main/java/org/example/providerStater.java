package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("org.example.dao")
@EnableEurekaClient
@SpringBootApplication
public class providerStater {
	public static void main(String[] args) {
		SpringApplication.run(providerStater.class,args);
	}
}
