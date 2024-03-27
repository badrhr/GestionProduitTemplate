package org.xproce.demoadvanced.service;

import org.xproce.demoadvanced.dao.entities.Product;

import java.util.List;

public interface ProductManager {

    public Product addProduct(Product product);
    public boolean deleteProduct(Product product);
    public boolean deleteProductById(Integer id);
    public Product updateProduct(Product product);
    public List<Product> getAllProduct();

    public Product getProductById(Integer id);
}
