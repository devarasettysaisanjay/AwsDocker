package com.example.awsDocker.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping(value="/test")
	public String test() {
		return "Welcome to Docker Application";
	}

}
