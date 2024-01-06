package com.easybytes.service.implementation;

import com.easybytes.service.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SonySpeakers implements Speakers {


    @Override
    public String playMusic() {
        return "sony music is playing";
    }
}
