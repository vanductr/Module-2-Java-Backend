package rikkei.academy;

public class Person {
    // Định nghĩa thuộc tính
    private float height; // Chiều cao (m)
    private float weight; // Cân nặng (kg)

    // Phương thức khởi tạo: dùng để tạo 1 đối tượng, trùng với tên class,
    // Không có dữ liệu trả về, Phạm vi truy cập phải là public.

    // Khi không khai báo phương thức khởi tạo, thì có phương thức khởi tạo mặc định không tham số.
    public Person() {

    }

    public Person(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override // Ghi đè của lớp Object
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    public float getBMI() {
        // Tính BMI
        return weight/(height*height);
    }
}
