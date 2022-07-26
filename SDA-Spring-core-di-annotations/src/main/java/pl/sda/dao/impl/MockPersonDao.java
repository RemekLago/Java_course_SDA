package pl.sda.dao.impl;

import pl.sda.dao.PersonDao;
import pl.sda.model.Person;

import java.util.List;

public class MockPersonDao implements PersonDao {

    @Override
    public Person getById(Integer id) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        return null;
    }

}
