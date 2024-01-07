package com.easybytes.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Data
@Component(value = "personBean")
@Lazy
public class Person {

    private String name;

    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("vehicle object created");
        this.vehicle = vehicle;
    }
}
