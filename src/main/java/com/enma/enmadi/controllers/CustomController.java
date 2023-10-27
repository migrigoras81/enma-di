/**
 * 
 */
package com.enma.enmadi.controllers;

import org.springframework.stereotype.Controller;

import com.enma.enmadi.services.GreetingService;

/**
 * 
 */
@Controller
public class CustomController {
	
	private final GreetingService greetingService;
	
	public CustomController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}



	public String customHello() {
//		System.out.println("Hello World!");
//		return "Hi All!";
		return greetingService.sayGreeting();
	}
}
