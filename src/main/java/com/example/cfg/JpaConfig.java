package com.example.cfg;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Profile("prod")
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.example.repo")
@EntityScan(basePackages = "com.example.entity")
public class JpaConfig {

	
	
}
