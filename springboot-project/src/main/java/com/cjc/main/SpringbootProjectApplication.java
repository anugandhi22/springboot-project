package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class SpringbootProjectApplication {

	public static void main(String[] args) {
		System.out.println("welcome ");
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}

}
