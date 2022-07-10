package app;

import dao.CarDao;
import dao.GenericDao;
import entity2.Address;
import entity2.Car;
import entity2.Person;
import entity2.Worker;
import net.bytebuddy.description.type.TypeList;

import javax.persistence.GeneratedValue;
import javax.persistence.Persistence;

public class AssociationDemoApp {
    public static void main(String[] args) {
        GenericDao<Person> persons =
                new GenericDao<>(Persistence.createEntityManagerFactory("kursSDA"), Person.class);
        final Person person = Person
                .builder()
                .firstName("Ewa")
                .lastName("kowal")
                .address(
                    Address.
                            builder()
                            .street("Wiazowa 123")
                            .city("kalisz")
                            .zipcode("24-234")
                            .build()
                )
                .build();
        persons.insert(person);

        persons.findAll().forEach(System.out::println);


        GenericDao<Worker> workers = new GenericDao<>(
                Persistence.createEntityManagerFactory("kursSDA"), Worker.class);
        final Worker worker = Worker
                .builder()
                .salary(2000)
                .position("magazynier")
                .car(null)
                .build();
        workers.insert(worker);

        CarDao cars = new CarDao(
                Persistence.createEntityManagerFactory("kursSDA"), Car.class);

        final Worker worker1 = Worker
                .builder()
                .salary(2000)
                .position("kierownik")
                .car(cars.find(1))
                .build();
        workers.insert(worker1);
    }
}
