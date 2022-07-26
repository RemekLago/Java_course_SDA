package pl.sda.dao;

import pl.sda.model.Person;

import java.util.List;


public interface PersonDao {

    Person getById(Integer id);

    List<Person> getAll();
}