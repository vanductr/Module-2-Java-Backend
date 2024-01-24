package ra.service;

import ra.model.Classes;
import ra.model.Subject;
import ra.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassesService {
    // Khai báo 1 mảng chứa các đối tượng lớp học
    private static final List<Classes> classesList = new ArrayList<>();

    // phương thức tìm kiếm theo id subject
    public static void displayClassBySubjectId() {
        if (SubjectService.subjects.length == 0) {
            System.out.println("Danh sách Môn học đang trống, Hãy thêm môn học!");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sách tất cả môn học:");
        for (Subject s : SubjectService.subjects) {
            s.displaySubjectInfo();
        }
        System.out.print("Nhâp vào id subject: ");
        int idSubject = sc.nextInt();
        sc.nextLine(); // Tránh nuốt dòng
        for (Classes c : classesList){
            for (Subject sj : c.getSubjects()){
                if(sj.getSubjectId()==idSubject){
                    System.out.println();
                    System.out.println("Đây là danh sách các Lớp được tìm theo ID Môn học.");
                    System.out.println();
                    c.displayData();
                } else {
                    System.out.println("Không tìm thấy Lớp nào có ID Môn học: " + idSubject);
                }
            }
        }

    }

    // Phương thức thêm lớp học mới
    public static void addNewClass() {
        Scanner scanner = new Scanner(System.in);

        // Nếu chưa có Môn học, đưa ra Lời nhắc và thoát vòng lặp
        if (SubjectService.subjects.length == 0) {
            System.out.println("Danh sách môn học đang trống!!!");
            System.out.println("Bạn cần thêm Môn học mới vào Danh sách các Môn học.");
            return;
        }

        // Lấy xác nhận của người dùng khi chưa có Học viên nào
        if (StudentService.studentList.isEmpty()) {
            System.err.println("Danh sách Học viên đang trống!");
            System.out.println("Bạn có muốn tạo lớp học mà Chưa thêm Học viên không?");
            System.out.print("Chọn: 1: Tiếp tục tạo Lớp  2: Thoát để Thêm Học viên: ");
            int choise = scanner.nextInt();
            scanner.nextLine(); // Tránh nuốt dòng
            if (choise == 2) {
                return;
            }
        }

        if (TeacherService.teacherList.isEmpty()) {
            System.out.println("Danh Sách Giảng viên trống!");
            System.out.println("Bạn có muốn thêm lớp học mà chưa cần Giảng viên?");
            System.out.print("Chọn 1: Tiếp tục thêm lớp học; Chọn 2: Dừng thêm Lớp học: ");
            int choise = scanner.nextInt();
            scanner.nextLine(); // Tránh nuốt dòng

                switch (choise) {
                    case 1:
                        break;
                    case 2:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!!!");
                }

        }

        System.out.println();
        System.out.println("------Nhập thông tin của Lớp học mới:------");
        System.out.println();
        
        // Khai báo 1 đối tượng trong class Classes
        Classes classes = new Classes();
        classes.inputData();

        // Đưa dữ liệu lấy được vào trong mảng
        classesList.add(classes);
    }

    // Phương thức Hiển thị Danh sách lớp học
    public static void displayAllClasses() {
        if (classesList.isEmpty()) {
            System.out.println();
            System.out.println("Danh sách lớp học trống !!!");
            return;
        }

        // Câu lệnh thông báo
        System.out.println("----Danh sách tất cả lớp học-------");

        // Dùng forEarch để lặp qua từng phần tử trong mảng và in ra.
        for (Classes classes : classesList) {
            classes.displayData();
            System.out.println("-----------------------------");
        }
    }

    // Phương thức hiển thị lớp học theo Teacher ID
    public static void displayClassByTeacherId(Scanner scanner) {
        if (TeacherService.teacherList.isEmpty()) {
            System.out.println("Danh sách Giảng viên đang trống!");
            System.out.println("Hãy Quay lại Menu chính và Thêm Giảng viên mới!");
            return;
        }

        // Hiển thị Danh sách Tất cả Giảng viên hiện có
        for (Teacher teacher : TeacherService.teacherList) {
            System.out.println("Danh sách Giảng viên Hiện đang Tại chức:");
            teacher.displayTeacherData();
        }

        System.out.print("Nhập ID của Giảng viên để theo dõi lớp học của họ: ");
        int teacherId = scanner.nextInt();
        scanner.nextLine(); // Tránh nuốt dòng

        // Vòng lặp for để lấy ra các đối tượng lớp học
        for (Classes classes : classesList) {
            if (classes.getTeacher().getTeacherId() == teacherId) {
                System.out.println();
                System.out.println("Đây là thông tin của lớp học được tìm theo ID Giảng viên:");
                classes.displayData();
            } else {
                System.out.println("Không thể tìm thấy Lớp học có Id Giảng viên là: " + teacherId);
            }
        }
    }

    // Phương thức thay đổi trạng thái Lớp học
    public static void changeClassStatusById() {
        if (classesList.isEmpty()) {
            System.out.println("Danh sách Lớp học trống!!!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID của Lớp học muốn đổi trạng thái: ");
        int classesId = Integer.parseInt(scanner.nextLine());

        for (Classes classes : classesList) {
            if (classes.getClassId() == classesId) {
                System.out.println("Trạng thái hiện tại của Lớp học:");
                System.out.println("ID: " + classes.getClassId());
                System.out.println("Tên: " + classes.getClassName());
                System.out.println("Trạng thái: " + classes.getClassStatus().getValue());

                System.out.print("Nhập trạng thái mới (1 - Chưa mở lớp, 2 - Chưa hoàn thành, 3 - Đã hoàn thành.): ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        classes.setClassStatus(Classes.ClassStatus.NOT_OPENED);
                        break;
                    case 2:
                        classes.setClassStatus(Classes.ClassStatus.NOT_COMPLETED);
                        break;
                    case 3:
                        classes.setClassStatus(Classes.ClassStatus.COMPLETED);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Giữ nguyên trạng thái cũ.");
                        break;
                }

                System.out.println("Trạng thái sau khi thay đổi:");
                classes.displayData();

                return;
            }
        }

        System.out.println("Không tìm thấy học sinh với ID: " + classesId);
    }

    // Phương thức tìm kiếm lớp theo tên giáo viên
    public static void searchClassesByTeacherName(Scanner scanner) {
        System.out.println();
        System.out.print("Nhập tên Giảng viên: ");
        String teacherName = scanner.nextLine();

        List<Classes> resultClasses = new ArrayList<>();

        for (Classes classes : classesList) {
            // Giả sử bạn có một phương thức getTeacherName() trong lớp Classes
            if (classes.getTeacher() != null && classes.getTeacher().getTeacherName().equalsIgnoreCase(teacherName)) {
                resultClasses.add(classes);
            }
        }

        if (resultClasses.isEmpty()) {
            System.out.println("Không tìm thấy Lớp học nào có Tên Giảng viên: " + teacherName);
        } else {
            System.out.println("Danh sách các Lớp có Giảng viên là: " + teacherName);
            for (Classes classes : resultClasses) {
                classes.displayData();
                System.out.println("-------------------------");
            }
        }
    }

    // Tìm kiếm lớp học theo Tên Môn học
    public static void searchClassesBySubjectName(Scanner scanner) {
        System.out.println();
        System.out.print("Nhập tên Môn học: ");
        String subjectName = scanner.nextLine();

        List<Classes> resultClasses = new ArrayList<>();

        for (Classes classes : classesList) {
            for (Subject subject : classes.getSubjects()) {
                if (subject.getSubjectName().equalsIgnoreCase(subjectName)){
                    resultClasses.add(classes);
                }
            }
        }

        if (resultClasses.isEmpty()) {
            System.out.println("Không tìm thấy Lớp học có Tên Môn học là: " + subjectName);
        } else {
            System.out.println("Danh sách các Lớp học tìm được theo Tên Môn học: " + subjectName);
            for (Classes classes : resultClasses) {
                classes.displayData();
                System.out.println("---------------------------");
            }
        }
    }

    // Tìm kiếm lớp học theo tên Lớp
    public static void searchClassesByClassName(Scanner scanner) {
        System.out.println();
        System.out.print("Nhập tên Lớp học: ");
        String className = scanner.nextLine();

        boolean found = false;
        for (Classes classes : classesList) {
            if (classes.getClassName().equalsIgnoreCase(className)) {
                System.out.println("Thông tin lớp học có tên lớp là: " + className);
                classes.displayData();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy Lớp học có tên: " + className);
        }
    }

    // Phương thức sửa thông tin lớp học
    public static void updateClassesInfo(Scanner scanner) {
        System.out.println();
        System.out.print("Nhập ID của Lớp học bạn muốn sửa: ");
        int classesId = scanner.nextInt();
        scanner.nextLine(); // Tránh nuốt dòng

        boolean found = false;
        for (Classes classes : classesList) {
            if (classes.getClassId() == classesId) {
                System.out.println("Đây là thông tin của lớp học cần chỉnh sửa:");
                classes.displayData();
                System.out.println("-------------------------");

                System.out.println("Nhập thông tin mới của Lớp học:");
                classes.inputData();
                System.out.println();
                System.out.println("Đã cập nhật thành công thông tin Lớp học.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy Lớp học nào có Id: " + classesId);
        }
    }
}
