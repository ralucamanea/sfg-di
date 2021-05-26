package sfg.springguru.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sfg.springguru.dependencyinjection.controllers.*;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("----------------------------------------");
		System.out.println("--------------------Primary Bean Controller");

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("----------------------------------------");
		System.out.println("--------------------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------------------------------------");
		System.out.println("--------------------Setter");

		SetterBasedInjectedController setterBasedInjectedController = (SetterBasedInjectedController) ctx.getBean("setterBasedInjectedController");
		System.out.println(setterBasedInjectedController.getGreeting());

		System.out.println("----------------------------------------");
		System.out.println("--------------------Constructor");
		ConstructorBasedInjectedController controller =  (ConstructorBasedInjectedController)  ctx.getBean("constructorBasedInjectedController");
		System.out.println(controller.getGreeting());
	}

}
