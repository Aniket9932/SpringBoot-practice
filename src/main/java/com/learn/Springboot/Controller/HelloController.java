package com.learn.Springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String HelloWorld() {
        return "Welcome Aniket !!";
    }
}
