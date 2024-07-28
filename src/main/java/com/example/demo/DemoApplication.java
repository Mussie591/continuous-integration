package com.example.demo;

import com.example.demo.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        var customers = new Customer[]{
                new Customer(1,"John", LocalDate.of(1992,5,31)),
                new Customer(2,"Smith", LocalDate.of(1995,8,15)),
                new Customer(3,"Bob", LocalDate.of(2002,9,27))
        };
    }

}
