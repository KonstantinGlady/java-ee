package ru.gik.javaEE.jsf.repsitories;


import ru.gik.javaEE.jsf.entities.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Model
@ApplicationScoped
public class ProductsRepository implements Serializable {
    private List<Product> products;

    public ProductsRepository() {
        initProducts();
    }

    private void initProducts() {
        products = new ArrayList<>();
        products.add(new Product(1L, "item1", "item", 50));
        products.add(new Product(2L, "item2", "item", 51));
        products.add(new Product(3L, "item3", "item", 501));
        products.add(new Product(4L, "item4", "item", 530));
        products.add(new Product(5L, "item5", "item", 506));
        products.add(new Product(6L, "item6", "item", 150));
        products.add(new Product(7L, "item7", "item", 2250));
        products.add(new Product(8L, "item8", "item", 5076));
        products.add(new Product(9L, "item9", "item", 5011));
    }

    public List<Product> getProducts() {

        //return new ArrayList<>(products);
        return products;
    }

    public String save(Product product) {
        products.add(product);
        return "/products.xhtml?faces-redirect=true";

    }

    public String delete(Product product) {
        products.removeIf(o -> o.getId().equals(product.getId()));
        return "/products.xhtml?faces-redirect=true";
    }
}
