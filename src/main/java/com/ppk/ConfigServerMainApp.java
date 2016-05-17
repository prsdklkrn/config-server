package com.ppk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerMainApp {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerMainApp.class, args);
	}
}