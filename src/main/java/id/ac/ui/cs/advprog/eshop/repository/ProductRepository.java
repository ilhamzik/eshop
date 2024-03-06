package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public interface ProductRepository {
    public Product create(Product product);
    public Product findById(String id);
    public Product update(Product updatedProduct, String newDataId);
    public Product delete(String id);
}