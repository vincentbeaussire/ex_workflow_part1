package org.example.exercice3.service;

import org.example.exercice3.model.Student;

import java.util.List;

public interface IStudentService {

    Student createStudent(Student student);

    Student getStudentById(Long id);

    List<Student> getAllStudents();

    List<Student> searchStudents(String search);
}
