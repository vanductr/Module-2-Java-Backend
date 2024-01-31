package ss9.baitap4;

public class Circle extends Shape{

    // Thuộc tính riêng của hình tròn
    private double radius;

    // Constructor có thừa hưởng từ cha
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Phương thức ghi đè từ cha
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
