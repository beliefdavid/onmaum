package com.beliefdavid.onmaumchildren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainViewController {

    @GetMapping("/main")
    public String mainViewController(){
        return "mainView";
    }
}
