package com.euronet.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		System.out.println("Spring Appllication running successfully");
		LmsApllication application = applicationContext.getBean("lmsApplication",LmsApllication.class);
		application.issueBook();
		
	}

}
