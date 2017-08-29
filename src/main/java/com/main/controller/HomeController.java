package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Home Controller
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Das boot";
    }

}
