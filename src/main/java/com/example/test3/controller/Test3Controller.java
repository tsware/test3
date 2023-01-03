package com.example.test3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Test3Controller {
        @GetMapping("/test3")
        public String test() {
            return "Hello World Auto Build Test and Deploy Test!!!!!!!!!";
        }
}
