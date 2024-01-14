package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Student.change(); // calling change method (Gọi phương thức change)

        // creating objects (Khởi tạo đối tượng)
        Student s1 = new Student(111, "Chinh");
        Student s2 = new Student(222, "Toan");
        Student s3 = new Student(333, "Dung");

        // calling display method (Gọi phương thức display)
        s1.display();
        s2.display();
        s3.display();
    }
}
