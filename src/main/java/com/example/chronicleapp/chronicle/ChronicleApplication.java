package com.example.chronicleapp.chronicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChronicleApplication {

    public static void main(String[] args) {

        SpringApplication.run(ChronicleApplication.class, args);
        System.out.println("This is the Spring boot App");
    }

}
