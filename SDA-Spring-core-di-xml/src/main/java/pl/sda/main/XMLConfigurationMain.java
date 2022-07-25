package pl.sda.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.service.PersonService;
import pl.sda.service.impl.PersonServiceImpl;

public class XMLConfigurationMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");


        PersonService personService = applicationContext.getBean("personService", PersonServiceImpl.class);
        System.out.println(personService.getAll());

    }
}
