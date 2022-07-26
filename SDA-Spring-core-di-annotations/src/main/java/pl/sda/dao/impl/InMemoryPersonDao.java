package pl.sda.dao.impl;

import pl.sda.dao.PersonDao;
import pl.sda.model.Person;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPersonDao implements PersonDao{

        private List<Person> personList;

        public InMemoryPersonDao(){
            personList = new ArrayList<>();
            personList.add(new Person(1, "Michal", "Nowak"));
            personList.add(new Person(2, "Anna", "Nowak"));
            personList.add(new Person(3, "Jan", "Kowalski"));
        }

    @Override
    public Person getById(Integer id){
        return personList.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public List<Person> getAll(){
        return personList;
    }
}

