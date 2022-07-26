package pl.sda.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.sda.dao.PersonDao;
import pl.sda.dao.impl.InMemoryPersonDao;
import pl.sda.dao.impl.MockPersonDao;
import pl.sda.service.PersonService;
import pl.sda.service.impl.PersonServiceImpl;
import pl.sda.util.StringUtil;

@Configuration
public class PersonConfiguration {

    @Bean
    public StringUtil stringUtil() {
        return new StringUtil();
    }

    @Bean
    public PersonDao inMemoryPersonDao() {
        return new InMemoryPersonDao();
    }

    @Bean
    public PersonDao mockPersonDao() {
        return new MockPersonDao();
    }

    @Bean
    public PersonService personService() {
        PersonServiceImpl personService = new PersonServiceImpl(inMemoryPersonDao());
        personService.setStringUtil(stringUtil());
        return personService;
    }

}
