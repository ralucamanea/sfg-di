package sfg.springguru.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfg.springguru.dependencyinjection.services.GreetingService;

//most preferred
@Controller
public class ConstructorBasedInjectedController {

    private final GreetingService greetingService;

    //can add @Autowired, but it's not mandatory, will work the same way anyway
    //@Qualifier - otherwise, we'll have confusion, as there are more Services of type GreetingService
    public ConstructorBasedInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
