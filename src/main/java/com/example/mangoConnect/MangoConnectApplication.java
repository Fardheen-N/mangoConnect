package com.example.mangoConnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("java.controller")
public class MangoConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangoConnectApplication.class, args);
	}

}
