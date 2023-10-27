/**
 * 
 */
package com.enma.enmadi.services;

import org.springframework.stereotype.Service;

/**
 * 
 */

@Service
public class SetterInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "HellooWorld - Setter Injected";
	}

}
