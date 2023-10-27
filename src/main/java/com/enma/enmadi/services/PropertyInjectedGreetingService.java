/**
 * 
 */
package com.enma.enmadi.services;

import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "HellooWorld - Property Injected";
	}

}
