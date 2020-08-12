package com.eCoronaCart.service;

import java.util.List;

import com.eCoronaCart.model.Product;

public interface ProductService {
	
	List<Product> getProductList();

    Product getProductById(int productId);
    
    void deleteProduct(Product product);
    
    void addProduct(Product product);
    
    void editProduct(Product product);

}
