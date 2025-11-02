package com.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/test-api")
	public String contest()
	{
		return "Welcome to dustche bank";
	}
	
	@GetMapping("/new-api")
	public String test()
	{
		return "To check how to add new lines..";
	}
}
