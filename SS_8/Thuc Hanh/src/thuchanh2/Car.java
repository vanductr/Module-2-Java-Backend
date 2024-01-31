package thuchanh2;


// extends Vehicle: extends: Mở rộng. -> Mở rộng từ class Vehicle(xe cộ)
// Tức là Class Car được mở rộng từ Class Vehicle(xe cộ), Nó kế thừa tất cả các thuộc
// tính của Class Vehicle(xe cộ) - Tính Kế thừa
public class Car extends Vehicle{
    // Khởi tạo phương thức không tham số
    public Car() {

    }

    // Định nghĩa phương thức có tham số
    public Car(String brand, String color) {
        // Gọi hàm khởi tạo của lớp cha, - khởi tạo các thuộc tính và
        // phương thức của lớp cha.
        // 2 đối số là brand và color, các đối số này để khởi tạo
        // các thuộc tính brand và color của lớp cha.
        super(brand, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + this.getBrand() + '\'' +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}
