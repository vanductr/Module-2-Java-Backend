package baitap2;

public class Point3DTest {
    public static void main(String[] args) {
        // Khởi tạo 1 đối tượng hình 3D
        Point3D point3D = new Point3D(); // Không tham số

        // Set giá trị cho x,y,z
        point3D.setX(3); // Phương thức setX được lấy từ cha của nó
        point3D.setY(4); // Phương thức setY được lấy từ class cha.
        point3D.setZ(5);

        // In ra point3D
        System.out.println(point3D);
    }
}
