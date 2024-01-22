package baitap1;

public class Circle { // Hình tròn: Được coi là class cha
    private double radius; // Bán kính
    private String color; // Màu sắc

    // Contructor để khởi tạo đối tượng có tham số. (Contructer khác với phương thức)
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Get-Set cho bán kính, màu sắc
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức toString() mặc định của 1 Object trong Java.
    @Override // Ghi đè phương thức toString() của lớp Object
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}
