package com.example.makemytrip_microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holiday {
    @GetMapping("/holiday")
    public String getData() {return  "Please book your flight ticket in Pune  20% discount" ; }
}