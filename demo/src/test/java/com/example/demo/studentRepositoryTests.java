package com.example.demo;

import com.example.demo.student.student;
import com.example.demo.student.studentRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class studentRepositoryTests {
    @Autowired
    private studentRepository repo;

    @Test
    public void TestAddNew() {
        student students = new student();
        students.setEpasts("janis.@gmail.com");
        students.setParole("1234455566");
        students.setVards("Janis");
        students.setUzvards("Kalnins");

        student savedstudents = repo.save(students);

        Assertions.assertThat(savedstudents).isNotNull();
        Assertions.assertThat(savedstudents.getId()).isGreaterThan(0);
    }
}
