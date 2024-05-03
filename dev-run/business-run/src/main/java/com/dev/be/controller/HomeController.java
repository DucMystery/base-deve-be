package com.dev.be.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business")
public class HomeController {

    @GetMapping("/getData")
    public ResponseEntity<String> getData(){

        String returnObject ="{\"deptId\":\"1\",\"name\":\"Security\"}";

        return new ResponseEntity<>(returnObject, HttpStatus.OK);
    }
}
