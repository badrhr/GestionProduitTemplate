package org.xproce.demoadvanced.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xproce.demoadvanced.dao.entities.Product;
import org.xproce.demoadvanced.dao.repositories.ProductRepository;

import java.util.List;
@Service
public class ProductService implements ProductManager {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {

        try{
          return  productRepository.save(product);
        }catch (Exception exception){
            System.out.println(exception.getMessage()); //Logger
            return null;
        }

    }

    @Override
    public boolean deleteProduct(Product product) {
        return false;
    }

    @Override
    public boolean deleteProductById(Integer id) {
        return false;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).get();
    }
}
