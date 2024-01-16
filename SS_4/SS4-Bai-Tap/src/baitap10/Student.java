package baitap10;

public class Student {
    private String name;
    private String classes;

    // Hàm tạo không tham số
    public Student() {
        this.name = "John";
        this.classes = "C02";
    }

    // Phương thức setter cho name
    public void setName(String name) {
        this.name = name;
    }

    // Phương thức setter cho classes
    public void setClasses(String classes) {
        this.classes = classes;
    }

    // Phương thức getter cho name
    public String getName() {
        return name;
    }

    // Phương thức getter cho classes
    public String getClasses() {
        return classes;
    }
}

