package com.demojwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@EnableAutoConfiguration
public class AppInitialize {

	public static void main(String[] args) {
		SpringApplication.run(AppInitialize.class, args);
	}
	
	@GetMapping("hi_man")
	public String index() {
		return "What's Up Maan !!";
	}

}
