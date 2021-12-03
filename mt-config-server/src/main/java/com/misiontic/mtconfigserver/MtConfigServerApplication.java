package com.misiontic.mtconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MtConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtConfigServerApplication.class, args);
	}

}
