package com.example.springcrud;

import com.example.springcrud.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SpringcrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcrudApplication.class, args);
    }

}
