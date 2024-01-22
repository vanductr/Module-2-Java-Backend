package rikkei.academy;

public class Triangle { // Hình tam giác
    private float a;
    private float b;
    private float c;
    public Triangle() {

    }
    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float tinhChuVi() {
        return a + b + c;
    }

    // Phương thức tính diện tích
    public float tinhDienTich() {
        // Tính nửa chu vi của tam giác
        float p = tinhChuVi() / 2;

        // Dùng công thức heron tính diện tích
        float dienTich = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return dienTich;
    }
}


























