package com.shenquan.luntan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController{

    @GetMapping(value = "")
    public String index(){
//        modelMap.addAttribute("name",name);
        return "index";
    }
}
