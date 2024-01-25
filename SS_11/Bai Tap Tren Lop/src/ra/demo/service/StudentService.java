package ra.demo.service;

import ra.demo.model.Student;

import java.util.List;

public interface StudentService extends GenericService<Student, Integer> {
    int getNewId();
    List<Student> findByName(String name);
}
