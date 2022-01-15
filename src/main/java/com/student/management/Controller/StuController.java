package com.student.management.Controller;

import java.util.List;

import com.student.management.Services.StudentService;
import com.student.management.Student.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/")
public class StuController {
     @Autowired
    private StudentService studentService;

    @GetMapping("/allStudents")
    public List<Student> getStudents() {
        return this.studentService.getAllStudent();
    }

    @GetMapping("/singleStudent/{id}")
    public Student singleStudent(@PathVariable("id") int id) {

        return studentService.getSingleStudent(id);

    }

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student stu) {
        Student student = null;

        try {
            student = this.studentService.addStudent(stu);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/removeStudent/{id}")
    public List<Student> deleteStudent(@PathVariable("id") int id) {

         this.studentService.removeStudent(id);
         return this.studentService.getAllStudent();

    }

    @PutMapping("/editStudent/{id}")
    public List<Student> editStudent(@RequestBody Student stu, @PathVariable("id") int id) {
        System.out.println(id);

        return this.studentService.editStudent(stu, id);

    }
}
