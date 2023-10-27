package com.enma.enmadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.enma.enmadi.controllers.ConstructorInjectedController;
import com.enma.enmadi.controllers.CustomController;
import com.enma.enmadi.controllers.I18nController;
import com.enma.enmadi.controllers.PropertyInjectedController;
import com.enma.enmadi.controllers.SetterInjectedController;

@SpringBootApplication
public class EnmaDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EnmaDiApplication.class, args);
		CustomController customController = (CustomController)ctx.getBean("customController");
//		String greeting = customController.customHello();
//		System.out.println(greeting);
		
		I18nController i18nController = (I18nController)ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		
		System.out.println("------------------- Primary Bean");
		System.out.println(customController.customHello());
		
		System.out.println("------------------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("------------------- SetterInjected");
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("------------------- ConstructerInjected");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		
	}

}
