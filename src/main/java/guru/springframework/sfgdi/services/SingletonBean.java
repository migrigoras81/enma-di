/**
 * 
 */
package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * Created by Marius I. Grigoras
 * 
 * on 01/11/2023
 */
@Component
public class SingletonBean {
	
	public SingletonBean() {
		System.out.println("Creating a Singleton bean!!!");
	}

	public String getMyScope() {
		return "I'm a Singleton";
	}
}
