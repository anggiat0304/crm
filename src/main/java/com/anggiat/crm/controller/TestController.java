package com.anggiat.crm.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/crm")
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<?> helloWorld(){
        return new ResponseEntity<>("Hello World",HttpStatus.OK);
    }
}
