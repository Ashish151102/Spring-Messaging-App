package com.example.Spring.Messaging.App.controller;

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
}