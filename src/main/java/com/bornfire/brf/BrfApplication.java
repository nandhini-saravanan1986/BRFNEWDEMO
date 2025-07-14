package com.bornfire.brf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.bornfire.xbrl.repositories")
@Configuration
@EnableScheduling
public class BrfApplication  extends SpringBootServletInitializer{
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BrfApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BrfApplication.class, args);
	}

}
