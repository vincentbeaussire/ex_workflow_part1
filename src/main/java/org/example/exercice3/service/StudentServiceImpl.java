package org.example.exercice3.service;

import org.example.exercice3.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{

    private List<Student> students = new ArrayList<>();
    private Long currentId = 1L;

    @Override
    public Student createStudent(Student student) {
        student.setId(currentId++);
        students.add(student);
        return student;
    }

    @Override
    public Student getStudentById(Long id) {
       // return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
        for (Student s: students){
            if(s.getId().equals(id)){
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public List<Student> searchStudents(String search) {
        List<Student> studentList = new ArrayList<>();
        for (Student s: students){
            if(s.getLastName().contains(search)){
                studentList.add(s);
            }
        }
        return studentList;
    }
}
