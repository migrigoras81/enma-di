/**
 * 
 */
package guru.springframework.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;

import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.I18NSpanishService;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;

/**
 * Created by Marius I. Grigoras
 * 
 * on 31/10/2023
 */

@EnableConfigurationProperties(SfgConstructorConfig.class)
// @PropertySource("classpath:datasource.properties")
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {
	
//	@Bean
//	FakeDataSource fakeDataSource(@Value("${enma.username}") String username,
//			@Value("${enma.password}") String password,
//			@Value("${enma.jdbcurl}") String jdbcurl) {
//		FakeDataSource fakeDataSource = new FakeDataSource();
//		fakeDataSource.setUsername(username);
//		fakeDataSource.setPassword(password);
//		fakeDataSource.setJdbcurl(jdbcurl);
//		
//		return fakeDataSource;
//	}
	
//	@Bean
//	FakeDataSource fakeDataSource(SfgConfiguration sfgConfiguration) {
//		FakeDataSource fakeDataSource = new FakeDataSource();
//		fakeDataSource.setUsername(sfgConfiguration.getUsername());
//		fakeDataSource.setPassword(sfgConfiguration.getPassword());
//		fakeDataSource.setJdbcurl(sfgConfiguration.getJdbcurl());
//		
//		return fakeDataSource;
//	}
	
	@Bean
	FakeDataSource fakeDataSource(SfgConstructorConfig sfgConstructorConfig) {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(sfgConstructorConfig.getUsername());
		fakeDataSource.setPassword(sfgConstructorConfig.getPassword());
		fakeDataSource.setJdbcurl(sfgConstructorConfig.getJdbcurl());
		
		return fakeDataSource;
	}
	
	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	
	@Profile({"dog", "default"})
	@Bean
	PetService dogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("dog"); 
	}
	
	@Profile("cat")
	@Bean
	PetService catPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("cat"); 
	}
	
	@Bean
	EnglishGreetingRepository englishGreetingRepository() {
		return new EnglishGreetingRepositoryImpl();
	}

	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
	
	// @Bean
	ConstructorGreetingService constructorGreetingService() {
		return new ConstructorGreetingService();
	}
	
	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}
	
	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}
	
	@Profile("EN")
	@Bean
	I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
		return new I18nEnglishGreetingService(englishGreetingRepository);
	}
	
	@Profile({"ES","default"})
	@Bean("i18nService")
	I18NSpanishService i18nSpanishService() {
		return new I18NSpanishService();
	}
}
