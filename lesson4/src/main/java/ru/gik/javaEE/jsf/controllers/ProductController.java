package ru.gik.javaEE.jsf.controllers;

import ru.gik.javaEE.jsf.entities.Product;
import ru.gik.javaEE.jsf.repsitories.ProductsRepository;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class ProductController implements Serializable {

    @Inject
    private ProductsRepository repository;

    private Product product;

    @PostConstruct
    public void init() {
        this.product = new Product();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProducts() {
        return repository.getProducts();
    }

    public String save() {
        return repository.save(product);
    }

    public String edit(Product product) {
        this.product = product;
        return "/product.xhtml?faces-redirect=true";
    }

    public void delete(Product product) {
         repository.delete(product);
    }
}
