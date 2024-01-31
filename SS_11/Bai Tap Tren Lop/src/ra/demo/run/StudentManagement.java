package ra.demo.run;

import ra.demo.model.Student;
import ra.demo.service.StudentService;
import ra.demo.service.StudentSv;
import ra.demo.util.InputMethods;

import java.util.List;

public class StudentManagement {
    private static StudentService studentService = new StudentSv();
    public static void main(String[] args) {
        while (true) {
            System.out.println("============ MENU =============");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin");
            System.out.println("4. Xoá theo ID");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6. Hiển thị theo tên tăng dần");
            System.out.println("0. Thoát");
            System.out.println("------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    displayAllStudent();
                    break;
                case 2:
                    addNewStudent();
                    break;
                case 3:
                    updateStudentInfo();
                    break;
                case 4:
                    deleteById();
                    break;
                case 5:
                    fillByName();
                    break;
                case 6:
                    displayAllStudentSortByName();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!!!");
            }
        }
    }

    protected static void displayAllStudent() {
        if (studentService.fillAll().isEmpty()){
            System.err.println("Danh sách rỗng.");
            return;
        }
        System.out.println("Danh sách Sinh viên:");
        for (Student student : studentService.fillAll()){
            System.out.println(student);
        }
    }

    protected static void displayAllStudentSortByName() {
        List<Student> students = studentService.fillAll();
        students.sort((o1, o2)-> o1.getStudentName().compareTo(o2.getStudentName()));
        if (students.isEmpty()){
            System.err.println("Danh sách rỗng.");
            return;
        }
        System.out.println("Danh sách Sinh viên:");
        for (Student student : students){
            System.out.println(student);
        }
    }

    protected static void fillByName() {
        System.out.print("Nhập chuỗi cần tìm: ");
        String name = InputMethods.getString();
        if (studentService.findByName(name).isEmpty()){
            System.err.println("Không tìm thấy kết quả phù hợp.");
            return;
        }
        System.out.println("Danh sách Sinh viên:");
        for (Student student : studentService.findByName(name)) {
            System.out.println(student);
        }
    }

    protected static void addNewStudent() {
        System.out.print("Nhập số lượng cần thêm: ");
        int count = InputMethods.getInteger();
        for (int i = 0; i < count; i++) {
            System.out.println("Nhập thông tin cho Học sinh thứ " + (i + 1));
            Student newStudent = new Student();
            newStudent.inputData();
            studentService.save(newStudent);
        }
        System.out.println("Thêm mới thành công " + count + " sinh viên.");
    }

    // Phương thức Xoá theo ID
    protected static void deleteById() {
        System.out.print("Nhập Id của học sinh muốn xoá: ");
        int studentId = InputMethods.getInteger();
        studentService.deleteById(studentId);
        System.out.println("Đã xoá thành công 1 học sinh khỏi danh sách.");
    }

    // Phương thức Sửa thông tin Học sinh
    protected static void updateStudentInfo() {
        System.out.print("Nhập Id của học sinh cần sửa: ");
        int studentId = InputMethods.getInteger();
        boolean found = false;
        for (Student student : studentService.fillAll()) {
            if (student.getStudentId() == studentId) {
                student.inputData();
                studentService.save(student);
                System.out.println("Đã sửa thông tin thành công.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học sinh có Id: " + studentId);
        }
    }
}















