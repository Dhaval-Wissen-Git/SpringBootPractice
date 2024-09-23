package com.wissen.springboot.practice.rest;


import com.wissen.springboot.practice.StudentService;
import com.wissen.springboot.practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/v1/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/v1/create")
    public String createStudent(){

        long count = studentService.getStudentCount();

        count += 1;
        Student s = new Student();
        s.setFirstName("John_" + count);
        s.setLastName("Doe");
        s.setEmail("XVWJk_" + count + "@example.com");
        return studentService.createStudent(s);
    }

    @GetMapping("/v1/getById")
    public Student getStudentById(@RequestParam("id") int id){
        return studentService.getStudentById(id);
    }

}
