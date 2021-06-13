package com.rbaystems.aws.demo.codepipelinedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello Micorservice in AWS Cloud.";
	}

}
