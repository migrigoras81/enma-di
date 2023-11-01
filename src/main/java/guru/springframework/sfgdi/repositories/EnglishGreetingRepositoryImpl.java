/**
 * 
 */
package guru.springframework.sfgdi.repositories;

/**
 * Created by Marius I. Grigoras
 * 
 * on 31/10/2023
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

	@Override
	public String getGreeting() {
		return "Hello World - EN";
	}

}
