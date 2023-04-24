package com.example.restfulwebsevice.controller;

import com.example.restfulwebsevice.model.Student;
import com.example.restfulwebsevice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentRestController {
//    inject service

    private final StudentService studentService;
    @Autowired
    StudentRestController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/allstudents")
    List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
