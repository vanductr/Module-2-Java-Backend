package ss9.baitap4;

public class Rectangle extends Shape { // Hình chữ nhật
    // Thêm 2 thuộc tính chiều dài và chiều rộng
    private Double width;
    private Double height;


    public Rectangle(String color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

}
