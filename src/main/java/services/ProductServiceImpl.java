package services;

import models.Product;
import repositories.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    private ProductRepository ProductRepository;

    public List<Product> getAllProduct() {
        return ProductRepository.getAllProduct();
    }

    public Product getProductByCategoryId(int categoryId) {
        return ProductRepository.getProductByCategoryId(categoryId);
    }
}
