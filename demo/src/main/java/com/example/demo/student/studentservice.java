package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class studentservice {


    @Autowired
    studentRepository repo;

    public student save() {

        student students = new student();
        students.setEpasts("janis.@gmail.com");
        students.setParole("1234455566");
        students.setVards("Janis");
        students.setUzvards("Kalnins");
        return repo.save(student);
    }

    public student getKlienti() {

        return repo.findById(1).get();

    }
}
