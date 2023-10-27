/**
 * 
 */
package com.enma.enmadi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		
		return "Hellor World - from the Primary Bean";
	}

}
