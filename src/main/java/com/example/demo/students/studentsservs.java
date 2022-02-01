package com.example.demo.students;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class studentsservs {
    @GetMapping

    public java.util.List<student> getStudents()
    {
        return List.of(
                new student(0L,"younes",22, LocalDate.of(2000, Month.JANUARY,5),"youens")
        );
    }
}
