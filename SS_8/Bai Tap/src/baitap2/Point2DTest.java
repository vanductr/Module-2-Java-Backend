package baitap2;

public class Point2DTest {
    public static void main(String[] args) {
        // Khởi tạo đối tượng từ class Point"2D
        Point2D point2D = new Point2D();
        // Hiển thị ra point2D là gì
        System.out.println(point2D); // Dùng phương thức toString để in ra.

        // Khởi tạo đối tượng với tham số truyền vào
        Point2D point2D1 = new Point2D(5.7,9.4);
        System.out.println(point2D1);

        // Dùng set để đặt lại gía trị của x và y
        point2D.setX(10);
        point2D.setY(15);

        // In ra với phương thức get
        System.out.println(point2D.getX());
        System.out.println(point2D.getY());

        // In ra toString
        System.out.println(point2D);
    }
}
