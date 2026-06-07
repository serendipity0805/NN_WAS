package com.swlee.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;


@Controller
public class MainController {

    @GetMapping("/")
    public String serverTest (Model model) {
        return "index";
    }

}
