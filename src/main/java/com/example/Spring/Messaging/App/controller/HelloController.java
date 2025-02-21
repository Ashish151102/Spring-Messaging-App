package com.example.Spring.Messaging.App.controller;

import com.example.Spring.Messaging.App.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name){
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloWithPathVariable(@PathVariable String name){
        return "Hello " + name + " from BridgeLabz";
    }


    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody UserDTO user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}