package baitap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManagement {
    private ArrayList<Student> studentList;

    public StudentManagement() {
        this.studentList = new ArrayList<>();
    }

    // Phương thức hiển thị tất cả sinh viên
    public void showAll() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    // Phương thức thêm sinh viên vào danh sách
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // Phương thức xóa sinh viên theo mã số sinh viên
    public void removeStudent(int studentId) {
        Student studentToRemove = findStudentById(studentId);
        if (studentToRemove != null) {
            studentList.remove(studentToRemove);
            System.out.println("Đã xóa sinh viên có mã số: " + studentId);
        } else {
            System.out.println("Không tìm thấy sinh viên có mã số: " + studentId);
        }
    }

    // Phương thức tìm sinh viên theo mã số sinh viên
    public Student findStudentById(int studentId) {
        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        System.out.println("Không tìm thấy sinh viên có mã số: " + studentId);
        return null;
    }

    // Phương thức tính điểm trung bình của tất cả sinh viên
    public double getAverageScore() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return 0.0;
        }

        double totalScore = 0.0;
        for (Student student : studentList) {
            totalScore += student.getAverageScore();
        }

        return totalScore / studentList.size();
    }

    // Phương thức sắp xếp sinh viên theo điểm tăng dần
    public void sortByScore() {
        Collections.sort(studentList, Comparator.comparingDouble(Student::getAverageScore));
    }
}

