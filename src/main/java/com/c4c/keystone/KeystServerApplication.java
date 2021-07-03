package com.c4c.keystone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class KeystServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeystServerApplication.class, args);
	}

}
