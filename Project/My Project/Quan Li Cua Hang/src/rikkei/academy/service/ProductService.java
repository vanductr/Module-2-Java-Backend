package rikkei.academy.service;

import rikkei.academy.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int productId);
    void addProduct(Product product);
    void updateProduct(int productId, Product product);
    void deleteProduct(int productId);
}

