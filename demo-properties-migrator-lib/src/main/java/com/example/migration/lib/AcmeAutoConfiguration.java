package com.example.migration.lib;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AcmeProperties.class)
public class AcmeAutoConfiguration {

	@Bean
	public ApplicationRunner acmeApplicationRunner(AcmeProperties properties) {
		return (arguments) -> {
			System.out.println(String.format("%nValue for name: '%s'%n", properties.getName()));
		};
	}

}
