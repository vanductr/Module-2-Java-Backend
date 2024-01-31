package rikkei.productmanagement;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> productList;

    public ProductManager() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void updateProduct(int productId, Product updatedProduct) {
        for (Product product : productList) {
            if (product.getId() == productId) {
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                product.setQuantity(updatedProduct.getQuantity());
                break;
            }
        }
    }

    public void removeProduct(int productId) {
        productList.removeIf(product -> product.getId() == productId);
    }

    public void displayProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public Product searchProductByName(String productName) {
        for (Product product : productList) {
            if (product.getName().contains(productName)) {
                return product;
            }
        }
        return null;
    }

    public void sortProductsByPriceAscending() {
        Collections.sort(productList, Comparator.comparingDouble(Product::getPrice));
    }

    public void sortProductsByPriceDescending() {
        Collections.sort(productList, Comparator.comparingDouble(Product::getPrice).reversed());
    }
}

