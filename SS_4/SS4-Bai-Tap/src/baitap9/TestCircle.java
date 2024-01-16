package baitap9;

public class TestCircle {
    public static void main(String[] args) {
        // Tạo đối tượng Circle
        Circle myCircle = new Circle(2.5);

        // Truy cập các phương thức getRadius() và getArea() và hiển thị kết quả
        // Vì các phương thức getRadius và getArea bên class Circle có bổ từ truy cập là private
        // Nên không thể truy cập trực tiếp. mình sẽ command 2 dòng này lại
        //System.out.println("Bán kính của hình tròn: " + myCircle.getRadius());
        //System.out.println("Diện tích của hình tròn: " + myCircle.getArea());


        System.out.println("Bán kính của hình tròn: " + myCircle.getCircleRadius());
        System.out.println("Diện tích của hình tròn: " + myCircle.getCircleArea());

    }
}

