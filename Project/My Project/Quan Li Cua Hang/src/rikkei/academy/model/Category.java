package rikkei.academy.model;

public class Category {
    private int id;
    private String name;

    // Constructors
    public Category() {
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
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

    // Custom method to display category data
    public void displayData() {
        System.out.println("Category ID: " + id);
        System.out.println("Category Name: " + name);
    }
}

