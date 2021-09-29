package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSetupDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =SpringApplication.run(SpringSetupDemoApplication.class, args);
		
//		System.out.println(context.getBean("greeting",String.class));
//		System.out.println(context.getBean("farewell",String.class));
		
		System.out.println(context.getBean("timeNow"));
	}

}
