package repositories;

import models.Product;
import java.util.List;


public interface ProductRepository {
    List<Product> getAllProduct();
   Product getProductByCategoryId(int categoryId);
}
