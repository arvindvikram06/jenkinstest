package com.jenkinstest.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webcontroller {

    @GetMapping("/")
    public String hello(){
        return "hello boy!!!!";
    }

}
