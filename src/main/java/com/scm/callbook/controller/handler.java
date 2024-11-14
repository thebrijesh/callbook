package com.scm.callbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class handler {
    @RequestMapping("/hm")
    public String handleRequest() {
        return "index";
    }

}
