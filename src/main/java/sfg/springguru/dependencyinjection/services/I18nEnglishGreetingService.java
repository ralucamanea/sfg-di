package sfg.springguru.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService
{
    @Override
    public String sayGreeting() {
        return "Hello-english";
    }
}
