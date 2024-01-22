package ss9.baitap4;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng rectangle(hình chữ nhật)
        Rectangle rectangle = new Rectangle("blue", 5.0, 7.0);

        // Tạo đối tượng hình tròn
        Circle circle = new Circle("red", 5.0);

        // Tính diện tích và hiển thị màu sắc của hình chữ nhật
        System.out.println("Diện tích của hình chữ nhật là: " + rectangle.getArea() + "\n" +
                            "Màu sắc: " + rectangle.getColor());

        System.out.println();

        // Tính diện tích và hiển thị màu sắc của hình tròn
        System.out.println("Diện tích của hình tròn là: " + circle.getArea() + "\n" +
                "Màu sắc: " + circle.getColor());
    }
}
