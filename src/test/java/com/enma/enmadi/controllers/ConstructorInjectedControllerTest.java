/**
 * 
 */
package com.enma.enmadi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.enma.enmadi.services.ConstructorGreetingService;

/**
 * 
 */
class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	/**
	 * Test method for {@link com.enma.enmadi.controllers.ConstructorInjectedController#getGreeting()}.
	 */
	@Test
	void testGetGreeting() {
//		fail("Not yet implemented");
		System.out.println(controller.getGreeting());
	}

}
