package com.easybytes.beans;

import com.easybytes.service.Speakers;
import com.easybytes.service.Tyres;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Vehicle {

    @Autowired
    private Tyres tyres;

    private String vehicleName;

    private Speakers speakers;

    @Autowired
    public void setSpeakers(Speakers speakers){
        this.speakers = speakers;
    }
}
