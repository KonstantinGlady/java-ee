package ru.gik.javaEE.jsf.entities;

import java.io.Serializable;

public class Category  implements Serializable {
    private Long Id;
    private String Name;

    public Category() {
    }

    public Category(Long id, String name) {
        Id = id;
        Name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
