package services;

import models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductByCategoryId(int categoryId);
}
