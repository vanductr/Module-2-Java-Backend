package rikkei.academy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Bước 1: Xây dựng lớp đối tượng
class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ReadWriteBinaryFile {

    public static void main(String[] args) {
        // Bước 2: Đọc danh sách sinh viên từ file nhị phân
        List<Student> studentList = readStudentListFromBinaryFile("/Users/tranvanduc/Documents/Tài liệu - MacBook Pro của Trần/Module 2/SS_18/Bai Tap/Bai Tap 7/src/rikkei/academy/students.txt");

        // Hiển thị danh sách trước khi thêm sinh viên mới
        System.out.println("Danh sách sinh viên trước khi thêm:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Bước 3: Thêm sinh viên mới vào danh sách
        Student newStudent = new Student("Alice Johnson", 23);
        studentList.add(newStudent);

        // Hiển thị danh sách sau khi thêm sinh viên mới
        System.out.println("\nDanh sách sinh viên sau khi thêm:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Bước 4: Ghi lại toàn bộ danh sách vào file nhị phân
        writeStudentListToBinaryFile("/Users/tranvanduc/Documents/Tài liệu - MacBook Pro của Trần/Module 2/SS_18/Bai Tap/Bai Tap 7/src/rikkei/academy/students.txt", studentList);

        System.out.println("\nDanh sách sinh viên đã được ghi lại vào file nhị phân.");
    }

    private static List<Student> readStudentListFromBinaryFile(String filePath) {
        List<Student> studentList = new ArrayList<>();

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            studentList = (List<Student>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file: " + e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return studentList;
    }

    private static void writeStudentListToBinaryFile(String filePath, List<Student> studentList) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

