package baitap2;

public class Point2D {
    private double x; // Khai báo thuộc tính x
    private double y; // Khai báo thuộc tính y

    public Point2D() { // Phương thức khởi tạo đối tượng không tham số
        this.x = 0.0; // Để mặc định giá trị của x là 0.0
        this.y = 0.0; // Để mặc định giá trị của y là 0.0
    }

    public Point2D(double x, double y) { // Phương thức khởi tạo đối tượng 2 tham số
        this.x = x;
        this.y = y;
    }

    // Get và set cho x và y
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Hiển thị bằng toString.
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

