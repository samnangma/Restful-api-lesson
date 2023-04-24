package com.example.restfulwebsevice.respository;

import com.example.restfulwebsevice.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentRepository {

    @Select("select * from student_tb")
    List<Student> getAllStudent();
}
