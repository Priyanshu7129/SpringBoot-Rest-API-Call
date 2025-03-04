package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // UC1: Simple GET request returning a static message
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // UC2: GET request with a query parameter
    @GetMapping("/query")
    public String sayHelloWithQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC3: GET request with a path variable
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC4: POST request with a JSON body
    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
