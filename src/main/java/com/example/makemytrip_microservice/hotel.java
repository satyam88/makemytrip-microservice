package com.example.makemytrip_microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel {
    @GetMapping("/hotel")

    public String getData() {return  "Please book your hotels  in Pune & Mumbai & kolkatta dellhi  chennai , madras, vellore at 20% discount" ; }
}
