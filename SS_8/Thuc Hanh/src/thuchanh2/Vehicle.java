package thuchanh2;

public class Vehicle {
    private String brand; // Khai báo thuộc tính brand(thương hiệu)

    private String color; // Khai báo thuộc tính color(màu sắc)

    public Vehicle() {

    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}















