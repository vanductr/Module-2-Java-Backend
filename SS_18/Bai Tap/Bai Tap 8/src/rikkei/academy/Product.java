package rikkei.academy;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private int productCode;
    private String productName;
    private String manufacturer;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int productCode, String productName, String manufacturer, double price, String description) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.description = description;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
