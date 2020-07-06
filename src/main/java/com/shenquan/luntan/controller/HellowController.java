package com.shenquan.luntan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HellowController {

    @GetMapping(value = "/hellow")
    public String hellow(ModelMap modelMap,@RequestParam(name = "name", required = false, defaultValue = "name") String name){
        modelMap.addAttribute("name",name);
        return "hellow";
    }
}
