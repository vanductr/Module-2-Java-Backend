package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng từ lớp Student bằng phương thức khởi tạo 6 tham số
        Student student1 = new Student(1, "Nguyễn Văn A", true, "JV-01", 19, "Hà Nội");
        Student student2 = new Student(2, "Nguyễn Thị B", false, "JV-02", 29, "Cao Bằng");
        Student student3 = new Student(3, "Nguyễn Văn C", true, "JV-03", 24, "Sơn La");

        // Hiển thị tất cả thông tin của đối tượng bằng phương thức display.
        System.out.println("-----------------Thông tin của student1--------------------");
        student1.display();
        System.out.println("-----------------Thông tin của student2--------------------");
        student2.display();
        System.out.println("-----------------Thông tin của student3--------------------");
        student3.display();
    }
}
