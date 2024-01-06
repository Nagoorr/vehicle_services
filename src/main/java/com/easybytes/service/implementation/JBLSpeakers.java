package com.easybytes.service.implementation;

import com.easybytes.service.Speakers;
import org.springframework.stereotype.Component;

@Component
public class JBLSpeakers implements Speakers {


    @Override
    public String playMusic() {
       return "JBL Speakers are playing";
    }
}
