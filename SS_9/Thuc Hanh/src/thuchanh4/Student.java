package thuchanh4;

public class Student extends Person { // Mở rộng từ lớp Cha Person
    // Phương thức khởi tạo không tham số
    public Student() {

    }

    // Phương thức khởi tạo có tham số
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Student{ Name: " + this.getName() +
                        " - Age : " + this.getAge() + "}");
    }
}
