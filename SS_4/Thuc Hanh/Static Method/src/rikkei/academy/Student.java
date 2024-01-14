package rikkei.academy;

public class Student {
    private int rollNo;
    private String name;
    private static String collage = "BBDIT";

    // constructor to initialize the variable (hàm tạo để khởi tạo biến)
    Student (int r, String n) {
        rollNo = r;
        name = n;
    }

    // static method to change the value of static variable(phương pháp tĩnh để thay đổi giá trị của biến tĩnh)
    static void change() {
        collage = "RIKKEI ACADEMY";
    }

    // method to display values(phương pháp hiển thị giá trị)
    void display() {
        System.out.println(rollNo + " " + name + " " + collage);
    }
}
