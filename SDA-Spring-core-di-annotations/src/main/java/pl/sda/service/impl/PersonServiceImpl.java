package pl.sda.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pl.sda.dao.PersonDao;
import pl.sda.model.Person;
import pl.sda.service.PersonService;
import pl.sda.util.StringUtil;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    private PersonDao personDao;

    private StringUtil stringUtil;

    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

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
        return null;
    }

    @Autowired
    public void setStringUtil(StringUtil stringUtil) {
        this.stringUtil = stringUtil;
    }
}
