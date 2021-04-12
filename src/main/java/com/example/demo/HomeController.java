package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String home() {
        return "home.html";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/address")
    public String address() {
        return "address.html";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/building")
    public String building() {
        return "building.html";
    }
}
