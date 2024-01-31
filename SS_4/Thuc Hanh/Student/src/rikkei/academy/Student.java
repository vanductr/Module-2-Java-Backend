package rikkei.academy;

public class Student {

    int studentId; // Khai báo ID của học sinh(Kiểu dữ liệu nguyên thuỷ - kiểu số nguyên int)

    String studentName; // Khai báo tên học sinh.
                        // String: Kiểu dữ liệu tham chiếu, kiểu dữ liệu chuỗi kí tự.

    boolean sex; // Kiểu dữ liệu nguyên thuỷ - kiểu logic(đúng/sai)

    String className;

    int age;

    String address;

    // Phương thức khởi tạo không tham số.
    // Phương thức này có tên giống với tên của lớp
    // Nhiệm vụ của phương thức này là: Khởi tạo các thuộc tính của đối tượng khi
    // đối tượng được tạo ra.
    public Student() {

    }

    // Phương thức khởi tạo 6 tham số.
    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }


    public void display() {
        System.out.println("Mã HS: " + studentId + "\n"
                        +  "Tên HS: " + studentName + "\n"
                        +  "Tuổi: " + age + "\n"
                        +  "Giới tính: " + (sex?"Nam" : "Nữ") + "\n"
                        +  "Lớp: " + className + "\n"
                        +  "Địa chỉ: " + address
        );
    }
}






















