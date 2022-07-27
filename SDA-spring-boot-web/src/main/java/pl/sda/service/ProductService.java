package pl.sda.service;

import pl.sda.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

    void save(Product product);


}
