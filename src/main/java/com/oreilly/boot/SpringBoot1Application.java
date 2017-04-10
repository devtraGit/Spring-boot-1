package com.oreilly.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBoot1Application {
	
	@RequestMapping("/")
	public String home(){return "hello";}

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}
}