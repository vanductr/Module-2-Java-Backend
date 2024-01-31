package thuchanh4;

public abstract class Person { // Class trừu tượng
    private String name; // Khai báo thuộc tính name

    private int age; // Khai báo thuộc tính tuổi

    // Phương thức khởi tạo không tham số
    public Person() {

    }

    // Phương thức khởi tạo có tham số
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Get - set cho name và age
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void displayInfo(); // Phương thức trừu tượng.
}

























