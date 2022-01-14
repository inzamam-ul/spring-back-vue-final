package com.student.management.Repository;

import com.student.management.Student.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    public Student findById(int id);

}
