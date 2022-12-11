package com.kharileigh.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.kharileigh")
@EnableJpaRepositories(basePackages = "com.kharileigh.persistence")
@EntityScan(basePackages = "com.kharileigh.entity")
public class MetroSystemCssApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetroSystemCssApplication.class, args);
	}

}
