package com.example.restfulwebsevice.service.serviceImpl;

import com.example.restfulwebsevice.model.Student;
import com.example.restfulwebsevice.respository.StudentRepository;
import com.example.restfulwebsevice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private  final StudentRepository studentRepository;

    @Autowired
    StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudent();
    }
}
