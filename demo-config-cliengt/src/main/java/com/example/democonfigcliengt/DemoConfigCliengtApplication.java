package com.example.democonfigcliengt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoConfigCliengtApplication {


	@RequestMapping("/")
	public String hello(){
		return "Hello";
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoConfigCliengtApplication.class, args);
	}

}
