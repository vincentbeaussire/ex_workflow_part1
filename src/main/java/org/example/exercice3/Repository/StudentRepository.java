package org.example.exercice3.Repository;

import org.example.exercice3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findAllByFirstName(String search);
}
