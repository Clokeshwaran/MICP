package com.example.demo_bosch_micp.controller;

import com.example.demo_bosch_micp.entity.User_entity;
import com.example.demo_bosch_micp.service.user_ser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class New_user {


    @Autowired
    user_ser service;

//    public New_user(user_ser service) {
//        this.service = service;
//    }

    @PostMapping("/new")
    public ResponseEntity<String> new_user(@RequestBody User_entity user) {
        return ResponseEntity.status(HttpStatus.OK).body(service.add_new(user));
    }



    @GetMapping("/get")
    public ResponseEntity<Map<?,?>> all_data() {
        List<?> user=new ArrayList();
        user=service.all_data();

        Map<String,Object> b = new LinkedHashMap<>();
        b.put("Title","lok");
        b.put("subtitle","lokeshwaran");

        b.put("object",user);



        return ResponseEntity.status(HttpStatus.OK).body(b);
    }
}
