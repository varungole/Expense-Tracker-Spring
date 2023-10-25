package com.varun.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//By this annotation, we indicate that this class is designed to handle
//HTTP Requests and return data in a format like JSON or XML
@RestController
@SpringBootApplication
public class HelloController {

    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login.html");
        return modelAndView;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }

}
