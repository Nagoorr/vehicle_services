package com.easybytes.controller;

import com.easybytes.service.Speakers;
import com.easybytes.service.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private Speakers speakers;

    @Autowired
    private Tyres tyres;

    @GetMapping("/rotateVehicle")
    public ResponseEntity<String> rotateVehicle() {
        return new ResponseEntity<>(tyres.rotate(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/playMusic")
    public ResponseEntity<String> playMusic() {
        return new ResponseEntity<>(speakers.playMusic(), HttpStatus.ACCEPTED);
    }

}
