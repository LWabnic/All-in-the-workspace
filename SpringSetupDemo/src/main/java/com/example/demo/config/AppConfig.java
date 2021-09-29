package com.example.demo.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean
	public String greeting() {
		return "Hello";
	}
	
	@Bean
	public String timeNow() {
		return "The time is :"+LocalTime.now();
	}
	
    @Bean
    @Scope("prototype")
    public String farewell() {
        return "Goodbye my friends";
    }
}

