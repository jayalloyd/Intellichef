package com.xyz.IntelliChef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class IntelliChefApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntelliChefApplication.class, args);
		System.out.println("hello world");
	}

}
