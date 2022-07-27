package pl.sda.service.impl;

import org.springframework.stereotype.Service;
import pl.sda.model.Product;
import pl.sda.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryProductService implements ProductService {

    private List<Product> products = new ArrayList<>();

    private static int productCounter;

    public InMemoryProductService() {
        products.add(new Product(1, "book", 56.54));
        products.add(new Product(2, "paper", 7.76));
        productCounter = 2;
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        product.setId(++productCounter);
        products.add(product);

    }
}
