package ru.gik.javaEE.jsf.repsitories;


import ru.gik.javaEE.jsf.entities.Category;
import ru.gik.javaEE.jsf.entities.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Model
@ApplicationScoped
public class CategoryRepository implements Serializable {
    private List<Category> categories;

    public CategoryRepository() {
        initProducts();
    }

    private void initProducts() {
        categories = new ArrayList<>();
        categories.add(new Category(1L, "category1"));
        categories.add(new Category(2L, "category2"));

    }

    public List<Category> getCategories() {

        return categories;
    }

    public String save(Category category) {
          categories.add(category);
        return "/categories.xhtml?faces-redirect=true";

    }
    
    public String delete(Category category) {
        categories.removeIf(o -> o.getId().equals(category.getId()));
        return "/categories.xhtml?faces-redirect=true";
    }
}
