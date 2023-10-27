/**
 * 
 */
package com.enma.enmadi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.enma.enmadi.services.GreetingService;
import com.enma.enmadi.services.ConstructorGreetingService;

/**
 * 
 */
class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}

	/**
	 * Test method for {@link com.enma.enmadi.controllers.SetterInjectedController#getGreeting()}.
	 */
	@Test
	void testGetGreeting() {
//		fail("Not yet implemented");
		System.out.println(controller.getGreeting());
	}

}
