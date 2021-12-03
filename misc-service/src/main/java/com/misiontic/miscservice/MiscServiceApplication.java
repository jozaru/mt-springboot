package com.misiontic.miscservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MiscServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiscServiceApplication.class, args);
	}

}
