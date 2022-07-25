package pl.sda.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pl.sda.dao.PersonDao;
import pl.sda.model.Person;
import pl.sda.service.PersonService;
import pl.sda.util.PersonValidator;
import pl.sda.util.StringUtil;
import static pl.sda.util.PersonValidator.validate;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    @Autowired
    @Qualifier("inMemoryPersonDao")
    private PersonDao personDao;

    @Autowired
    private StringUtil stringUtil;

    @Autowired
    private PersonValidator personValidator;

//    wstrzykiwanie przez konstruktor
//    public PersonServiceImpl(PersonDao personDao) {
//        this.personDao = personDao;
//    }

//    wstrzykiwanie przez setter
//    public void setStringUtil(StringUtil stringUtil) {
//        this.stringUtil = stringUtil;
//    }

    @Override
    public Person getById(String id) {
        return personDao.getById(stringUtil.parseString(id));
    }

    @Override
    public List<Person> getAll() {
        return personDao.getAll();
    }

    @Override
    public Person add(Person person) {
        validate(person);
        return personDao.add(person);
    }
}
