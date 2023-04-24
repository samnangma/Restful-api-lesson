package com.example.restfulwebsevice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private int id;
    private String name;
    private String gender;
    private String classname;
    private float score;
}
