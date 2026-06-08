package com.rithu.week20app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Week20App v1.0.0";
    }

    @GetMapping("/version")
    public String version() {
        return "Application Version: 1.0.0";
    }
}
