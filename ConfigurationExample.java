package com.Project.autowired.example;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationExample {
	int a=10;
	
	public void printName() {
		System.out.println("Hello..... ");
		System.out.println(a);
		
	}

}
