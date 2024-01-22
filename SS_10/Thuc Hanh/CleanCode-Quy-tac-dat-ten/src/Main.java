import rikkei.academy.Triangle;

public class Main {
    public static void main(String[] args) {
        //Khởi tạo đối tượng
        Triangle triangle = new Triangle(3, 4, 5);

        // Tính chu vi
        System.out.println("Chu vi của tam giác là: " + triangle.tinhChuVi());

        // Tính diện tích
        System.out.println("Diện tích của tam giác là: " + triangle.tinhDienTich());
    }
}
