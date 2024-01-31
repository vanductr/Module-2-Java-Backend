package ra.demo.service;

import ra.demo.model.Student;
import ra.demo.util.InputMethods;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentSv implements StudentService{
    private static List<Student> studentList = new ArrayList<>();

    static {
        try {
            studentList = new ArrayList<>(
                    Arrays.asList(
                            new Student(1, "Hồ Xuân Hương", InputMethods.sdf.parse("1/1/2000"), true),
                            new Student(2, "Nguyễn Duy Quang", InputMethods.sdf.parse("1/1/2007"), false),
                            new Student(3, "Nguyễn Viết Lan", InputMethods.sdf.parse("1/1/2005"), true)
                    )
            );
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Student> fillAll() {
        return studentList;
    }

    @Override
    public Student findById(Integer id) {
        for (Student student : studentList) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void save(Student student) {
        if (findById(student.getStudentId()) == null) {
            // Thêm mới
            student.setStudentId(getNewId());
            studentList.add(student);
        } else {
            // Cập nhật
            studentList.set(studentList.indexOf(findById(student.getStudentId())), student);
        }
    }

    @Override
    public void deleteById(Integer id) {
        studentList.remove(findById(id));
    }

    @Override
    public int getNewId() {
        int maxId = 0;
        for (Student student : studentList) {
            if (maxId < student.getStudentId()) {
                maxId = student.getStudentId();
            }
        }
        return maxId + 1;
    }

    @Override
    public List<Student> findByName(String name) {
        return studentList.stream().filter((stu)->stu.getStudentName().toLowerCase().contains(name.toLowerCase())).toList();
    }
}











