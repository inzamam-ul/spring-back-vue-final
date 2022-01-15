package com.student.management.Services;

import java.util.List;

import com.student.management.Repository.StudentRepository;
import com.student.management.Student.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent() {

        List<Student> stu = (List<Student>) this.studentRepository.findAll();

        return stu;

    }

    // get Single student

    public Student getSingleStudent(int id) {
        Student student = null;
        try {
            student = this.studentRepository.findById(id);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return student;

    }

    // adding the student
    public Student addStudent(Student stu) {
        Student result = studentRepository.save(stu);
        return result;
    }

    // Delete student
    public List<Student> removeStudent(int id) {
        List<Student> student = null;

        try {
            studentRepository.deleteById(id);
            student = (List<Student>) this.studentRepository.findAll();

            return student;

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return student;

    }

    public List<Student> editStudent(Student stu, int id) {
        List<Student> student = null;

        try {
           
            studentRepository.save(stu);
            student = (List<Student>) this.studentRepository.findAll();

            return student;

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return student;

    }

}

