package org.sec.vwa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VWAController {

    @GetMapping("/")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/")
    public String loginSubmit() {
        return "home";
    }

}
