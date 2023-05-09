package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author apollo
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test")
    public String testDemo(){
        return "test demo success!";
    }
}
