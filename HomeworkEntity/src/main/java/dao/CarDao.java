package dao;

import entity2.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CarDao extends GenericDao<Car>{
    public CarDao(EntityManagerFactory factory, Class<Car> clazz) {
        super(factory, clazz);
    }

    public List<Car> findPriceGreater(BigDecimal limit){
        final EntityManager em = factory.createEntityManager();
        final List<Car> cars = em.createQuery("select c from Car c where c.price > :limit", Car.class)
                .setParameter("limit", limit)
                .getResultList();
        em.close();
        return cars;
    }

    public List<String> findAllModels(){
        final EntityManager em = factory.createEntityManager();
        final List<String> models = em
                .createQuery("select distinct c.model from Car c", String.class)
                .getResultList();
        em.close();
        return models;
    }

    public Map<String, BigDecimal> findAveragePricePerModel(){
        final EntityManager em = factory.createEntityManager();
        final List<Object> objects = em
                .createQuery("select avg(c.price), c.model from Car c group by c.model", Object.class)
                .getResultList();
        em.close();
        objects.forEach((System.out::println));
        return null;
    }
}