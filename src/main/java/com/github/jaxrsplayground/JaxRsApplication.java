package com.github.jaxrsplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JaxRsApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
//		System.setProperty("server.servlet.context-path", "/home");
		SpringApplication.run(JaxRsApplication.class, args);
		System.out.println("Initial setup");
	}

}
