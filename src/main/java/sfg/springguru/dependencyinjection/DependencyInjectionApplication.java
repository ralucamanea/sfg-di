package sfg.springguru.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sfg.springguru.dependencyinjection.controllers.ConstructorBasedInjectedController;
import sfg.springguru.dependencyinjection.controllers.MyController;
import sfg.springguru.dependencyinjection.controllers.PropertyInjectedController;
import sfg.springguru.dependencyinjection.controllers.SetterBasedInjectedController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		System.out.println("--------------------No dependency Controller");
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("--------------------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------------------Setter");

		SetterBasedInjectedController setterBasedInjectedController = (SetterBasedInjectedController) ctx.getBean("setterBasedInjectedController");
		System.out.println(setterBasedInjectedController.getGreeting());

		System.out.println("--------------------Constructor");
		ConstructorBasedInjectedController controller =  (ConstructorBasedInjectedController)  ctx.getBean("constructorBasedInjectedController");
		System.out.println(controller.getGreeting());


	}

}
