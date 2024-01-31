package ra.model;

import java.util.Scanner;

public class Subject {
    // Khai báo các thuộc tính của Subject
    private Integer subjectId;
    private String subjectName;
    private boolean subjectStatus;

    // Constructor không tham số
    public Subject() {
    }

    // Constructor đầy đủ tham số
    public Subject(int subjectId, String subjectName, boolean subjectStatus) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.subjectStatus = subjectStatus;
    }

    // Các phương thức Getter và Setter
    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public boolean isSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(boolean subjectStatus) {
        this.subjectStatus = subjectStatus;
    }

    // Phương thức nhập liệu từ người dùng
    public void inputSubjectInfo() {
        Scanner scanner = new Scanner(System.in);

        if (subjectId == null) {
            System.out.print("Nhập ID Môn học: ");
            this.subjectId = Integer.valueOf(scanner.nextLine());
        }

        System.out.print("Nhập tên Môn học: ");
        //scanner.nextLine(); // Đọc dòng trống để xử lý lỗi khi nhập chuỗi sau khi nhập số
        this.subjectName = scanner.nextLine();

        System.out.print("Nhập trạng thái môn học (true để Mở, false để Khoá): ");
        this.subjectStatus = scanner.nextBoolean();
    }

    // Phương thức hiển thị thông tin môn học
    public void displaySubjectInfo() {
        System.out.println("Subject ID: " + subjectId);
        System.out.println("Subject Name: " + subjectName);
        System.out.println("Subject Status: " + (subjectStatus ? "Mở" : "Khoá"));
    }
}
