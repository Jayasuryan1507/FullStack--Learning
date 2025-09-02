package com.Project.autowired.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Project.autowired.example.sub.Demo;

@SpringBootApplication
public class SpringProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringProject1Application.class, args);
		
	One obj=context.getBean(One.class);
		obj.view();
		
//		Demo obj=context.getBean(Demo.class);
//		obj.simple();
		
//		ConfigurationExample ob=context.getBean(ConfigurationExample.class);
//		ob.printName();
		
		
	}

}
