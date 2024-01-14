package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        // Truy cập thuộc tính, phương thức không cần khởi tạo đối tượng
        System.out.println("Tên: " + StaticMethod.name);
        System.out.println("Tuổi: " + StaticMethod.age);

        StaticMethod.showInfo();

        // Khởi tạo đối tượng
        StaticMethod staticMethod = new StaticMethod();
        System.out.println("Tên: " + staticMethod.name);
        System.out.println("Tuổi: " + staticMethod.age);

        staticMethod.showInfo();
    }
}
