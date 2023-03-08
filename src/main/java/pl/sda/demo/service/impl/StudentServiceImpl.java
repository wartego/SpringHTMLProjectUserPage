package pl.sda.demo.service.impl;

import org.springframework.stereotype.Service;
import pl.sda.demo.entity.Student;
import pl.sda.demo.repository.StudentRepository;
import pl.sda.demo.service.StudentService;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
