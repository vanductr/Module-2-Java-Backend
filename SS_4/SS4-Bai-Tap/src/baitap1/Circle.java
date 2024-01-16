package baitap1; // Xây dựng lớp hình tròn.

public class Circle {
    // Khai báo các thuộc tính
    private double radius;

    // Contructor không tham số
    public Circle() {

    }

    // Contructor có tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter và setter cho bán kính
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Phương thức tính chu vi
    public double chuVi() {
        return 2 * Math.PI * radius;
    }

    // Phương thức tính diện tích
    public double dienTich() {
        return Math.PI * Math.pow(radius, 2);
    }
}















