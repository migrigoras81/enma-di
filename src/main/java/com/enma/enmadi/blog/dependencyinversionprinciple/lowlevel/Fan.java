/**
 * 
 */
package com.enma.enmadi.blog.dependencyinversionprinciple.lowlevel;

import com.enma.enmadi.blog.dependencyinversionprinciple.highlevel.Switchable;

/**
 * 
 */
public class Fan implements Switchable {

	@Override
	public void turnOn() {
		System.out.println("Fan: Fan turned on...");
	}

	@Override
	public void turnOff() {
		System.out.println("Fan: Fan turned on...");
	}

}
