package com.example.StudentLogBook.Student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mahee= new Student(
                            "Mr Mahee",
                            "Uttora-11",
                            "mahee@gmail.com",
                            LocalDate.of(1993, Month.MAY,19)
                    );
            Student ayonv= new Student(
                    "Mr ayon",
                    "elephant Road",
                    "ayon@gmail.com",
                    LocalDate.of(1991, Month.AUGUST,15)
            );
            Student nabil= new Student(
                    "Mr nabil",
                    "dhanmondi-19",
                    "nabil@gmail.com",
                    LocalDate.of(1993, Month.JULY,21)
            );

            studentRepository.saveAll(List.of(mahee,ayonv,nabil));
        };

    }

}
