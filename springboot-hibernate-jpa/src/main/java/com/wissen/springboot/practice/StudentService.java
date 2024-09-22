package com.wissen.springboot.practice;

import com.wissen.springboot.practice.model.Student;
import com.wissen.springboot.practice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public String createStudent(Student student){
        return studentRepository.save(student).toString();
    }

    public long getStudentCount(){
        return studentRepository.count();
    }
}
