package com.a01336625.semanaTecMartin.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping("/getname")
    public String getName(){
        return "Luis Enrique";
    }
}
