package ra.model;

import java.util.Scanner;

public class Teacher {
    private Integer teacherId;
    private String teacherName;
    private TeacherStatus teacherStatus;
    public Teacher() {
    }

    public Teacher(int teacherId, String teacherName, TeacherStatus teacherStatus) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherStatus = teacherStatus;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public TeacherStatus getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(TeacherStatus teacherStatus) {
        this.teacherStatus = teacherStatus;
    }

    public void inputTeacherData() {
        Scanner scanner = new Scanner(System.in);

        if (teacherId == null) {
            System.out.print("Nhập mã Giảng viên: ");
            this.teacherId = Integer.valueOf(scanner.nextLine());
        }

        System.out.print("Nhập tên Giảng viên: ");
        this.teacherName = scanner.nextLine();

        System.out.print("Chọn trạng thái Giảng viên (1 - Đang dạy, 2 - Nghỉ phép, 3 - Đã nghỉ việc): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                this.teacherStatus = TeacherStatus.DANG_DAY;
                break;
            case 2:
                this.teacherStatus = TeacherStatus.NGHI_PHEP;
                break;
            case 3:
                this.teacherStatus = TeacherStatus.DA_NGHI_VIEC;
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Đặt trạng thái là Đang dạy.");
                this.teacherStatus = TeacherStatus.DANG_DAY;
                break;
        }
    }

    // Phương thức để hiển thị dữ liệu Giảng viên
    public void displayTeacherData() {
        System.out.println("Mã Giảng viên: " + teacherId);
        System.out.println("Tên Giảng viên: " + teacherName);
        System.out.println("Trạng thái Giảng viên: " + teacherStatus);
    }

    // Phương thức lấy trạng thái Giáo viên
    public enum TeacherStatus {
        DANG_DAY("Đang dạy"),
        NGHI_PHEP("Nghỉ phép"),
        DA_NGHI_VIEC("Đã nghỉ việc");

        private final String label;

        TeacherStatus(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }
}
