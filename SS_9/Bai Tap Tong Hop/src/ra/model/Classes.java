package ra.model;

import ra.service.StudentService;
import ra.service.SubjectService;
import ra.service.TeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Classes {
    public enum ClassStatus {
        NOT_OPENED("Chưa mở lớp"),
        NOT_COMPLETED("Chưa hoàn thành"),
        COMPLETED("Đã hoàn thành");

        private final String value;

        ClassStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private Integer classId;
    private String className;
    private ClassStatus classStatus;
    private Teacher teacher;
    private static Student[] students;
    private static Subject[] subjects;

    public Classes() {

    }
    public Classes(int classId, String className, ClassStatus classStatus, Teacher teacher, Student[] students, Subject[] subjects) {
        this.classId = classId;
        this.className = className;
        this.classStatus = classStatus;
        this.teacher = teacher;
        this.students = students;
        Classes.subjects = subjects;
    }

    // Getters and setters

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ClassStatus getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(ClassStatus classStatus) {
        this.classStatus = classStatus;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        Classes.subjects = subjects;
    }

    // Phương thức nhập dữ liệu
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã lớp: ");
        this.classId = Integer.valueOf(scanner.nextLine());
        System.out.print("Nhập tên lớp: ");
        this.className = scanner.nextLine();

        // Lựa chọn trạng thái lớp học
        System.out.println("Chọn trạng thái lớp học:");
        for (ClassStatus status : ClassStatus.values()) {
            System.out.println(status.ordinal() + ". " + status.getValue());
        }
        int statusChoice = scanner.nextInt();
        this.classStatus = ClassStatus.values()[statusChoice];

        // Hiển thị Danh sách Giảng viên
        if (!TeacherService.teacherList.isEmpty()) {
            System.out.println("Danh Sách Giảng viên hiện có:");
            for (Teacher teacher : TeacherService.teacherList) {
                teacher.displayTeacherData();
            }

            // Cho người dùng chọn Giảng viên thông qua ID
            boolean flag = true; // Biến Cờ
            while (flag) {
                System.out.print("Nhập Id của Gỉang viên muốn thêm vào lớp này: ");
                int teacherId = scanner.nextInt();
                scanner.nextLine(); // Tránh nuốt dòng.
                Teacher teacher = TeacherService.findTeacherById(teacherId);
                if (teacher == null) {
                    System.out.println("Không tìm thấy Giảng viên nào có Id: " + teacherId);
                    System.out.println("Hãy kiểm tra lại.");
                } else {
                    this.teacher = teacher;
                    flag = false;
                }
            }
        }

        // Cho người dùng chọn Môn học cho Lớp
        if (SubjectService.subjects.length>0){
            System.out.println("Danh sách môn học: ");
            for (Subject sj:SubjectService.subjects){
                sj.displaySubjectInfo();
            }
            Subject[] resultSubject = new Subject[0];
            while (true){
                System.out.println("-----------------------------");
                System.out.println("1. Thêm");
                System.out.println("2. Thoát");
                System.out.println("-----------------------------");
                System.out.print("Nhập vào lựa chọn: ");
                int choice = scanner.nextInt();
                if(choice ==2){
                    if(resultSubject.length == 0){
                        System.err.println("Vui lòng thêm môn học");
                    } else {
                        break;
                    }
                } else {
                    while (true) {
                        System.out.print("Nhập vào ID muốn thêm: ");
                        int subjectId = scanner.nextInt();
                        scanner.nextLine(); // Tránh nuốt dòng

                        // Tìm môn học thông qua ID
                        Subject subject = SubjectService.findSubjectById(subjectId);

                        if (subject == null) {
                            System.out.println("Không tìm thấy Môn học có ID: " + subjectId);
                            System.out.println("Hãy kiểm tra lại.");
                        } else {
                            Subject[] newResultSubject = new Subject[resultSubject.length + 1];
                            for (int i = 0; i < newResultSubject.length; i++) {
                                newResultSubject[resultSubject.length + i] = subject;
                            }
                            resultSubject = newResultSubject;
                            System.out.println("Đã thêm Môn học vào cho Lớp học hiện tại.");
                            System.out.println("Quay về Menu Thêm - Thoát.");
                            break;
                        }
                    }
                }
            }
            subjects = resultSubject;
        }


        // Chọn Học viên cho lớp học.(Thêm học viên vào lớp học) bằng ID của học viên
        if(!StudentService.studentList.isEmpty()) { // Nếu có Học viên trong Danh sách
            // Thì hiển thị Danh sách Học viên ra
            System.out.println("Tiếp tục thêm Học viên vào lớp học.");
            System.out.println("---- Danh sách tất cả Học viên hiện tại: ------");
            for (Student student : StudentService.studentList) {
                student.displayStudentData();
                System.out.println("--------------------------------------");
            }

            // Tạo 1 Menu để Người dùng Chọn 'Thêm' hoặc 'Thoát'
            List<Student> resultStudent = new ArrayList<>(); // Tạo 1 mảng chứa tạm thời các đối tượng student
            while (true) {
                System.out.println();
                System.out.print("Chọn 1: Thêm Học viên ; 2: Thoát ");
                int choise = scanner.nextInt();
                scanner.nextLine(); // Tránh nuốt dòng

                if (choise == 2) { // Nếu thoát
                    if (resultStudent.isEmpty()) {
                        System.err.println("Chưa có học sinh nào trong lớp, Hãy thêm học sinh!");
                    } else {
                        break;
                    }
                }

                System.out.print("Nhập ID của Học viên cần thêm vào Danh sách Lớp: ");
                int addStudentId = scanner.nextInt();
                scanner.nextLine(); // Tránh nuốt dòng

                boolean found = false; // Biến kiểm soát
                for (Student student : StudentService.studentList) {
                    if (student.getStudentId() == addStudentId) {
                        resultStudent.add(student);
                        System.out.println("Vừa thêm thành công 1 Học viên mới vào Lớp học.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Không tìm thấy Học viên trong Danh sách có ID: " + addStudentId);
                }
            }

            // Gán các đối tượng vào trong Mảng
            students = resultStudent.toArray(new Student[0]);
        }

        // Thông báo cho người dùng biết
        System.out.println("Đã thêm thành công thông tin lớp học mới.");
    }

    // Phương thức hiển thị dữ liệu
    public void displayData() {
        System.out.println("Mã lớp: " + this.classId);
        System.out.println("Tên lớp: " + this.className);
        System.out.println("Trạng thái lớp: " + this.classStatus.getValue());
        if (teacher == null) {
            System.out.println("Giảng viên của lớp này tạm thời chưa sắp xếp.");
        } else {
            System.out.println("Giảng viên đứng lớp: " + this.teacher.getTeacherName());
        }
        System.out.println("Môn học của lớp: " + String.join(", ", getSubjectNames()));
        System.out.println("Học viên của lớp: " + String.join(", ", getStudentNames()));
    }

    // Phương thức lấy tên môn học của lớp này
    public List<String> getSubjectNames() {
        List<String> subjectNames = new ArrayList<>();
        for (Subject subject : subjects) {
            subjectNames.add(subject.getSubjectName());
        }
        return subjectNames;
    }

    // Phương thức lấy tên của Học viên Trong Mảng.
    public List<String> getStudentNames() {
        List<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            studentNames.add(student.getStudentName());
        }
        return studentNames;
    }
}
