package ra.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private Integer studentId;
    private String studentName;
    private Date dateOfBirth;
    private StudentStatus studentStatus; // Sử dụng enum cho trạng thái học sinh

    // Constructors
    public Student() {
        // Constructor mặc định
    }

    public Student(int studentId, String studentName, Date dateOfBirth, StudentStatus studentStatus) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        this.studentStatus = studentStatus;
    }

    // Getters and setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public StudentStatus getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(StudentStatus studentStatus) {
        this.studentStatus = studentStatus;
    }

    // Phương thức để lấy dữ liệu từ người dùng
    public void inputStudentData() {
        Scanner scanner = new Scanner(System.in);

        if (studentId == null) {
            System.out.print("Nhập mã sinh viên: ");
            this.studentId = Integer.valueOf(scanner.nextLine());
        }

        System.out.print("Nhập tên sinh viên: ");
        this.studentName = scanner.nextLine();

        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        String dateString = scanner.nextLine();
        try {
            this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
        } catch (ParseException e) {
            System.out.println("Định dạng ngày sinh không hợp lệ. Sử dụng định dạng dd/MM/yyyy.");
        }

        System.out.print("Chọn trạng thái sinh viên (1 - Đang học, 2 - On Job Training, 3 - Đã tốt nghiệp): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                this.studentStatus = StudentStatus.DANG_HOC;
                break;
            case 2:
                this.studentStatus = StudentStatus.ON_JOB_TRAINING;
                break;
            case 3:
                this.studentStatus = StudentStatus.DA_TOT_NGHIEP;
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Đặt trạng thái là Đang học.");
                this.studentStatus = StudentStatus.DANG_HOC;
                break;
        }
    }

    // Phương thức để hiển thị dữ liệu sinh viên
    public void displayStudentData() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Ngày sinh: " + new SimpleDateFormat("dd/MM/yyyy").format(dateOfBirth));
        System.out.println("Trạng thái sinh viên: " + studentStatus);
    }

    // Các giá trị enum cho trạng thái học sinh
    public enum StudentStatus {
        DANG_HOC("Đang học"),
        ON_JOB_TRAINING("On Job Training"),
        DA_TOT_NGHIEP("Đã tốt nghiệp");

        private final String label;

        StudentStatus(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }
}

