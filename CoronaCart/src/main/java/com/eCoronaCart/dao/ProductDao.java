package com.eCoronaCart.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.eCoronaCart.model.Product;


public interface ProductDao {

	List<Product> getProductList();

    Product getProductById(int productId);
    
    void deleteProduct(Product product);
    
    void addProduct(Product product);
    
    void editProduct(Product product);
}
