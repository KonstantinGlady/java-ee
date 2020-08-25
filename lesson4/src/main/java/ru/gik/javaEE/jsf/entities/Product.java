package ru.gik.javaEE.jsf.entities;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Named
@RequestScoped
public class Product implements Serializable {

    @NotNull(message = "поле не должно быть пустым")
    private Long id;

    @NotNull(message = "поле не должно быть пустым")
    @Size(min = 3, max = 25, message = "минимум 3 мах 5")
    private String name;

    private String description;

    @NotNull(message = "поле не должно быть пустым")
    private int price;

    public Product() {

    }

    public Product(Long id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
