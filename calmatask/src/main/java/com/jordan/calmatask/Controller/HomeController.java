package com.jordan.calmatask.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "volviendo a programar...";
    }

}
