package ss9.baitap4;

abstract class Shape {
    // Thuộc tính
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Phương thức Get/Set cho thuộc tính color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức trừu tượng tính diện tích
    public abstract double getArea();

    // Phương thức hiển thị màu sắc
    public void display() {
        System.out.println("Màu sắc: " + color);
    }
}
