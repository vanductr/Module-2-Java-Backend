package rikkei.academy.model;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int id;
    private LocalDate orderDate;
    private Customer customer;
    private List<Product> products;
    private double totalPrice;

    // Constructors
    public Order() {
    }

    public Order(int id, LocalDate orderDate, Customer customer, List<Product> products, double totalPrice) {
        this.id = id;
        this.orderDate = orderDate;
        this.customer = customer;
        this.products = products;
        this.totalPrice = totalPrice;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    // Custom method to display order data
    public void displayData() {
        System.out.println("Order ID: " + id);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + ": " + product.getPrice());
        }
    }
}

