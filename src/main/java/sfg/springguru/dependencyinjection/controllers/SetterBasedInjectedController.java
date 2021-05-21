package sfg.springguru.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfg.springguru.dependencyinjection.services.GreetingService;

//less preferred
@Controller
public class SetterBasedInjectedController {

    private GreetingService greetingService;

    //otherwise, we'll have confusion, as there are more Services of type GreetingService
    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
