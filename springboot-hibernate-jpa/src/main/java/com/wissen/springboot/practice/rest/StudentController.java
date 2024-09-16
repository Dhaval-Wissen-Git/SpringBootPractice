package com.wissen.springboot.practice.rest;


import com.wissen.springboot.practice.StudentService;
import com.wissen.springboot.practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
