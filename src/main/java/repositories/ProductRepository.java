package repositories;

import models.Product;
import java.util.List;


public interface ProductRepository {
    List<Product> getAllProduct();
    List<Product> getProductByCategoryId(int categoryId);
}
