package com.example.demo.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/students")
public class studentcontroller {
    private final studentsservs studentsservs ;

    @Autowired
    public studentcontroller(com.example.demo.students.studentsservs studentsservs) {
        this.studentsservs = studentsservs;
    }

    @GetMapping

    public java.util.List<student> getStudents()
    {
        return studentsservs.getStudents();
    }
}
