package com.example.springcrud.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student sohanjain = new Student(
                    "SohanJain",
                    "snsohanjain@gmail.com",
                    LocalDate.of(2000, Month.MARCH,06)

            );
            Student nithinjain = new Student(
                    "NithinJain",
                    "NithinJain@gmail.com",
                    LocalDate.of(1990, Month.MARCH,12)

            );
            repository.saveAll(
                    List.of(sohanjain,nithinjain)
            );
        };
    }
}
