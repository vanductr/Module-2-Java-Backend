package rikkei.academy.service;

import rikkei.academy.model.Product;
import rikkei.academy.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public Product getProductById(int productId) {
        return productRepository.getProductById(productId);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public void updateProduct(int productId, Product product) {
        productRepository.updateProduct(productId, product);
    }

    @Override
    public void deleteProduct(int productId) {
        productRepository.deleteProduct(productId);
    }
}

