package pl.sda.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.configuration.PersonConfiguration;
import pl.sda.service.PersonService;
import pl.sda.service.impl.PersonServiceImpl;

public class AnnotationConfigurationMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(PersonConfiguration.class);

        PersonService personService = applicationContext.getBean("personService", PersonServiceImpl.class);
        System.out.println(personService.getAll());
    }
}
