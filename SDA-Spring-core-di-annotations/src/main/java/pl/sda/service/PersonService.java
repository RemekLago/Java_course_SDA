package pl.sda.service;

import pl.sda.model.Person;

import java.util.List;

public interface PersonService {

    Person getById(String id);

    List<Person> getAll();

    Person add(Person person);
}
