package sfg.springguru.dependencyinjection.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import sfg.springguru.dependencyinjection.services.GreetingService;

//least preferred
@Controller
public class PropertyInjectedController {

    //otherwise, we'll have confusion, as there are more Services of type GreetingService
    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
