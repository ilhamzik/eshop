package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.repository.ProductRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepositoryImpl productRepositoryImpl;

    @Override
    public Product create(Product product){
       productRepositoryImpl.create(product);
       return product;
    }

    @Override
    public List<Product> findAll(){
        Iterator<Product> productIterator =  productRepositoryImpl.findAll();
        List<Product> allProduct = new ArrayList<>();
        productIterator.forEachRemaining(allProduct::add);
        return allProduct;
    }

    @Override
    public Product getById(String productId) {
        return productRepositoryImpl.findById(productId);
    }

    @Override
    public Product edit(Product updatedProduct, String newDataId) {
        return productRepositoryImpl.update(updatedProduct, newDataId);
    }

    @Override
    public String delete(String productId) {
        Product target = productRepositoryImpl.findById(productId);
        List<Product> productIterator = findAll();

        productRepositoryImpl.delete(productId);

        return "Success";
    }
}
