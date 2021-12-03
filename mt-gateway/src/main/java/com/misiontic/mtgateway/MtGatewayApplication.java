package com.misiontic.mtgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MtGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtGatewayApplication.class, args);
	}

}
