package com.groupeisi.springjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MS GASSAMA
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello world from spring jenkins ci-cd";
    }
}
