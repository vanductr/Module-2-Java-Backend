package thuchanh2;

public class Motorcycle extends Vehicle{
    // Khởi tạo phương thức không tham số
    public Motorcycle() {

    }

    // Khởi tạo phương thức có tham số
    public Motorcycle(String brand, String color) {
        super(brand, color); // Tương tự như Class Car, đây cũng là hàm để gọi đến các thuộc
                            // tính của Class cha.
    }

    // Phương thức hiển thị toString()

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + this.getBrand() + '\'' +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}
