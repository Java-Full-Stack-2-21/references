package com.revature.HelloSpringMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
* As we saw... The configuration of the IOC container can get complex... and our example was small
*
* Spring boot is an opinionated way to create a spring project
* 	- spring boot sacrifices detailed configuration options for simplicity
*
* What ways is Spring Boot opinionated?
* 	- spring beans are defined with annotations instead of being defined in the beans.xml file (opinionated)
* 	- component scan for annotations start at the level where the main method is
* 	- if you are creating a web server with http requests, a Tomcat server is already embedded into the application
*
* */
@SpringBootApplication
public class HelloSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringMvcApplication.class, args);
	}

}
