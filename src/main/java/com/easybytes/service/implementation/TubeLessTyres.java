package com.easybytes.service.implementation;

import com.easybytes.service.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class TubeLessTyres implements Tyres {


    @Override
    public String rotate() {
        return "tube less tyres are rotating";
    }
}
