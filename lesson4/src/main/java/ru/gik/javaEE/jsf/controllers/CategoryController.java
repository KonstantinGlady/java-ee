package ru.gik.javaEE.jsf.controllers;

import ru.gik.javaEE.jsf.entities.Category;
import ru.gik.javaEE.jsf.entities.Product;
import ru.gik.javaEE.jsf.repsitories.CategoryRepository;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class CategoryController implements Serializable {
    @Inject
    private CategoryRepository categoryRepository;

    private Category category;

    @PostConstruct
    public void init(Category category) {
        this.category = new Category();
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String edit(Category category) {
        this.category = category;
        return "/category.xhtml?faces-redirect=true";
    }

    public String delete(Category category) {
        return categoryRepository.delete(category);
    }

    public String save() {
        return categoryRepository.save(category);
    }

    public List<Category> getAll() {
        return categoryRepository.getCategories();
    }
}
