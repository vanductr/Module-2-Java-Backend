package thuchanh4;

public class Teacher extends Person { // Mở rộng từ class Person
    // Phương thức khởi tạo không tham số
    public Teacher() {

    }

    // Phương thức khởi tạo có tham số
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher{ Name: " + this.getName() +
                " - Age : " + this.getAge() + "}");
    }
}
