package com.misiontic.mtdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MtDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtDiscoveryApplication.class, args);
	}

}
