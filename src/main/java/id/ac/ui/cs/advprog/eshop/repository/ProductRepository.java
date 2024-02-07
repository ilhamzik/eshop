package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private  List<Product> productData = new ArrayList<>();

    public Product create(Product product){
        productData.add(product);
        return product;
    }

    public Iterator<Product> findAll(){
        return productData.iterator();
    }

    public Product findById(String productId) {
        Iterator<Product> productIterator = findAll();
        List<Product> allProduct = new ArrayList<>();
        productIterator.forEachRemaining(allProduct::add);

        for (Product product : allProduct){
            if (product.getProductId().equals(productId)){
                return product;
            }
        }
        return null;
    }

    public Product update(Product targetProduct, String newId) {
        for (int i = 0; i < productData.size(); i++) {
            Product product = productData.get(i);
            if (product.getProductId().equals(newId)) {
                productData.set(i, targetProduct);
                return targetProduct;
            }
        }
        return null;
    }

    public Product delete(Product targetProduct) {
        for (int i = 0; i < productData.size(); i++) {
            Product product = productData.get(i);
            if (product == targetProduct) {
                productData.remove(targetProduct);
                return targetProduct;
            }
        }
        return null;
    }
}