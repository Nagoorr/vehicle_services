package com.easybytes.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Data
@Component(value = "personBean")
public class Person {

    private String name;

    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }
}
