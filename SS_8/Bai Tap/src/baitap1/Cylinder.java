package baitap1;

public class Cylinder extends Circle { // Hình trụ được thừa hưởng từ hình tròn.
    private double height; // Thuộc tính chiều cao chỉ có riêng cho hình trụ

    // Contructor với 3 tham số.
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    // Phương thức Getter và Setter cho Chiều cao.
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Phương thức tính Thể tích của hình trụ
    public double getVolume() {
        return getArea() * height; // Thừa hưởng phương thức tính Diện tích từ Class cha
    }

    @Override // Ghi đè phương thức của Class Object
    public String toString() {
        return "Cylinder [radius=" + getRadius() + ", color=" + getColor() + ", height=" + height + "]";
    }
}

