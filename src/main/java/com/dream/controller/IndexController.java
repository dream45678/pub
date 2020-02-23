package com.dream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/login")
    public String login(){
        return "Public/login";
    }


    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
