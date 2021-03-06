package services;

import models.Category;
import java.util.List;


//Repeat methods from "repositories"
public interface CategoryService {
    void add(Category name);
    void delete(Category name);
    List<Category> getAllCategories();
}
