package com.easybytes.service.implementation;

import com.easybytes.service.Tyres;
import org.springframework.stereotype.Component;

@Component
public class TubeTyres implements Tyres {


    @Override
    public String rotate() {
        return "tube tyres are rotating";
    }
}
