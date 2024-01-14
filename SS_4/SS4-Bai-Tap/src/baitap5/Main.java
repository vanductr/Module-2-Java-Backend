package baitap5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Phương thức main huyền thoại
        Scanner scanner = new Scanner(System.in);

        // Kiểu khai báo mảng mới: Student là 1 lớp, lớp này mô tả 1 sinh viên.
        // Tên mảng: students - mảng này có kiểu dữ liệu là Student.
        // Mỗi phần tử của mảng students là một đối tượng của lớp Student.
        // Do đó, mỗi phần tử của mảng có thể được sử dụng để lưu trữ thông tin của 1 sinh viên.
        Student[] students = new Student[100];

        int studentCount = 0;

        int choice;

        do {
            System.out.println("Menu chức năng:");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("0. Thoát");

            System.out.println();
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới để loại bỏ kí tự Enter.

            switch (choice) {
                case 1:
                    displayAllStudents(students, studentCount);
                    break;
                case 2:
                    addNewStudent(students, studentCount);
                    studentCount++;
                    break;
                case 3:
                    editStudent(students, studentCount);
                    break;
                case 4:
                    deleteStudent(students, studentCount);
//                    studentCount--;
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }

    // Phương thức hiển thị danh sách tất cả học sinh
    public static void displayAllStudents(Student[] students, int studentCount) {
        if(studentCount == 0) {
            System.out.println("Danh sách học sinh trống.");
        } else {
            for (int i = 0; i < studentCount; i++) {
                System.out.println("Học sinh thứ " + (i +1) + ":");
                students[i].displayData();
            }
        }
    }

    // Phương thức thêm học sinh mới.
    public static void addNewStudent(Student[] students, int studentCount) {
        Student newStudent = new Student();
        newStudent.inputData();
        students[studentCount] = newStudent;
        System.out.println("Thêm mới học sinh thành công.");
    }

    // Phương thức sửa thông tin học sinh.
    public static void editStudent(Student[] students, int studentCount) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã học sinh cần sửa: ");
        String codeToEdit = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            if(students[i].getStudentCode().equals(codeToEdit)) {
                System.out.println("Thông tin học sinh trước khi sửa:");
                students[i].displayData();

                System.out.println("Nhập thông tin học sinh mới:");
                students[i].inputData();

                System.out.println("Sửa thông tin học sinh thành công.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy học sinh có mã " + codeToEdit);
        }
    }

    // Phương thức xoá học sinh
    public static int deleteStudent(Student[] students, int studentCount) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã học sinh cần xoá: ");
        String codeToDelete = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            if(students[i] != null && students[i].getStudentCode().equals(codeToDelete)) {
                System.out.println("Thông tin học sinh cần xoá:");
                students[i].displayData();

                for (int j = 0; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[studentCount - 1] = null;
                System.out.println("Xoá học sinh thành công.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy học sinh có mã " + codeToDelete);
        } else studentCount--; // Giảm số lượng học sinh sau khi xoá thành công

        return studentCount;
    }
}




















