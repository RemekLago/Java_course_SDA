package app;

import dao.CarDao;
import dao.GenericDao;
import entity2.*;

import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;

public class AssociationDemoApp {

    private static final GenericDao<Tool> tools = new GenericDao<>(
            Persistence.createEntityManagerFactory("kursSDA"),
            Tool.class
    );
    private static final GenericDao<Person> persons = new GenericDao<>(Persistence.createEntityManagerFactory("kursSDA"), Person.class);
    private static final GenericDao<Student> students = new GenericDao<>(
            Persistence.createEntityManagerFactory("kursSDA"), Student.class
    );
    private static final GenericDao<Worker> workers = new GenericDao<>(
            Persistence.createEntityManagerFactory("kursSDA"),
            Worker.class
    );
    private static final GenericDao<Article> articles = new GenericDao<>(
            Persistence.createEntityManagerFactory("kursSDA"),
            Article.class
    );

    private static final GenericDao<Tag> tags = new GenericDao<>(
            Persistence.createEntityManagerFactory("kursSDA"),
            Tag.class
    );


    public static void main(String[] args) {
        final Person person = Person
                .builder()
                .firstName("Ewa")
                .lastName("Kowal")
                .address(
                        Address
                                .builder()
                                .street("Wiązowa 13/45a")
                                .city("Kalisz")
                                .zipCode("24-890")
                                .build()
                )
                .build();
        //persons.insert(person);
        persons.findAll().forEach(System.out::println);
        final Student student = Student.builder()
                .email("adam@sda.pl")
                .name("Adam Karolak")
                .album(
                        Album.builder()
                                .number(343434)
                                .build()
                )
                .build();
        students.insert(student);
        CarDao cars = new CarDao(
                Persistence.createEntityManagerFactory("kursSDA"),
                Car.class
        );
        final Worker worker = Worker
                .builder()
                .salary(200)
                .position("magazynier")
                .departmentName("Magazyny")
                .car(null)
                .build();
        cars.insert(
                Car
                        .builder()
                        .price(new BigDecimal("40000"))
                        .power(100)
                        .model("Fiat 500")
                        .build()
        );

        workers.insert(worker);
        workers.insert(
                Worker
                        .builder()
                        .position("kierownik")
                        .salary(6000)
                        .departmentName("Rozliczenia")
                        .car(cars.find(1))
                        .build()
        );
        workers.insert(
                Worker
                        .builder()
                        .position("menadżer")
                        .salary(6000)
                        .departmentName("Rozliczenia")
                        .car(null)
                        .build()
        );
        tools.insert(
                Tool
                        .builder()
                        .name("młotek")
                        .worker(workers.find(1))
                        .build()
        );
        //dodaj pracownikowi o id = 1 narzędzie świder
        tools.insert(
                Tool
                        .builder()
                        .name("świder")
                        .worker(workers.find(1))
                        .build()
        );
        Worker entity = workers.find(1);
        System.out.println(workers.find(1));
        //usuwamy pracownikowi jego narzędzia
        //Jeśli ustawimy kaskadę REMOVE w Worker dla pola tools to poniższe usuwanie narzędzi (dzieci) jest zbędne
        //        tools.delete(1L);
        //        tools.delete(2L);
        //usuwamy pracownika
        workers.delete(1L);

        //Przy kaskadzie PERSIST dodanie nowego pracownika posiadającego nowe narzędzie ORM utrwali obie encje
        final Worker spawacz = Worker
                .builder()
                .car(null)
                .departmentName("Magazyny")
                .salary(3000)
                .tools(new ArrayList<>())
                .position("spawacz")
                .build();
        final Tool palnik = Tool
                .builder()
                .name("palnik")
                .worker(spawacz)
                .build();
        spawacz.getTools().add(palnik);
        workers.insert(spawacz);
        //tworzymy encje artykułu
        final Article article = Article
                .builder()
                .tags(new HashSet<>())
                .title("Hibernate")
                .build();
        //tworzymy encję tagu
        final Tag tag = Tag
                .builder()
                .name("Programming")
                .build();
        //dodajemy obie encje do bazy
        articles.insert(article);
        tags.insert(tag);
        //realizujemy związek między encjami dodając do encji artykułu tag
        article.getTags().add(tag);

        //Dodaj jeszcze jeden tag 'Database' do artykułu 'article'
        Tag newTag = Tag.builder().name("Database").build();
        tags.insert(newTag);
        article.getTags().add(newTag);
        //robimy update encji nadrzędnej - artykułu
        articles.update(article.getId(), article);
        final Article article1 = articles.find(1L);
        System.out.println(article1.getTags());

        final Author author = Author
                .builder()
                .name("")
                .build();

    }
}
