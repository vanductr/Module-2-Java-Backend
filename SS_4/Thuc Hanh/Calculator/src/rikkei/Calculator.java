package rikkei;

public class Calculator {
    double a;

    double b;

    // Phương thức khởi tạo không tham số.
    public Calculator() {

    }

    // Phương thức khởi tạo 2 tham số.
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Các phương thức get/set
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    // Phương thức tính tổng
    public double add() {
        return a + b;
    }
    // Phương thức tính hiệu
    public double sub() {
        return a - b;
    }
    // Phương thức tính tích
    public double multi() {
        return a * b;
    }
    // Phương thức tính thương
    public double div() {
        return a / b;
    }
}














