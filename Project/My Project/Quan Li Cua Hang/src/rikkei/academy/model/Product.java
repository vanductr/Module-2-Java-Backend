package rikkei.academy.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private Category category;
    private int stockQuantity; // Số lượng tồn kho
    private String description; // Mô tả sản phẩm

    // Constructors
    public Product() {
    }

    public Product(int id, String name, double price, Category category, int stockQuantity, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.description = description;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Custom method to display product data
    public void displayData() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Description: " + description);
    }
}


