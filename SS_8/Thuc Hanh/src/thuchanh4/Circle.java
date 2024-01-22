package thuchanh4;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Phuương thức tính diện tích
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Phương thức tính chu vi
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Cài đè phương thức toString của class Object trong Java


    @Override
    public String toString() {
        return "Hình tròn với bán kính = "
                + getRadius()
                + ", đó là một lớp con của "
                + super.toString();
    }
}































