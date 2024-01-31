package baitap2;

public class Point3D extends Point2D { // Đây là class được kế thừa từ cha nó là: Point2D

    // Khai báo thêm thuộc tính về chiều cao.
    private double z;

    // Phương thức khởi tạo không tham số, có kế thừa thuộc tính từ cha
    public Point3D(){
        super();
        this.z = 0.0;
    }

    // Phương thức khởi tạo có tham số
    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    // Get-Set cho z
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    // Phương thức toString hiển thị x,y,z

    @Override
    public String toString() {
        return "Point3D {" +
                " x = " + getX() +
                "; y = " + getY() +
                "; z = " + z +
                " } ";
    }
}















