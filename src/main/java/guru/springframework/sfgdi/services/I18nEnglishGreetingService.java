package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;

/**
 * Created by jt on 12/27/19.
 */
//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
	
	private final EnglishGreetingRepository englishGreetingRepository;
	
    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
		this.englishGreetingRepository = englishGreetingRepository;
	}


	@Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
