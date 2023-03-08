package pl.sda.demo.service;

import pl.sda.demo.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);

}
