package sfg.springguru.dependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * Created by raluc on 5/21/2021.
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "HelloWorld";
    }
}
