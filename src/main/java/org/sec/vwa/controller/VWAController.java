package org.sec.vwa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VWAController {

    @RequestMapping("/home")
    public String home(Model model) {
        return "home";
    }

    @RequestMapping("/xss")
    public String xss(@RequestParam(value="message") String message, Model model) {
        model.addAttribute("message", message);
        return "xss";
    }
}
