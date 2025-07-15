package org.example.exercice3.service;

import org.example.exercice3.Repository.StudentRepository;
import org.example.exercice3.model.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class StudentServiceSqlImpl implements IStudentService{

    private final StudentRepository studentRepository;

    public StudentServiceSqlImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> searchStudents(String search) {
        return studentRepository.findAllByFirstName(search);
    }
}
