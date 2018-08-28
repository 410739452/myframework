package com.pf.myframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pf.myframework")
public class MyFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFrameworkApplication.class, args);
	}
}
