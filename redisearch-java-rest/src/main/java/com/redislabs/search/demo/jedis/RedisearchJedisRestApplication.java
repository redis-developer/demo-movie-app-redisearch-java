package com.redislabs.search.demo.jedis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisearchJedisRestApplication {

	public static void main(String[] args) {
		// Read environment variables
		String port = System.getenv("PORT");
		if (port == null) {
			port = "8085";
		}
		SpringApplication app = new SpringApplication(RedisearchJedisRestApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);
	}

}
