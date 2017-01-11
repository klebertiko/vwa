package org.sec.vwa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VWAController {

    @RequestMapping("/")
    public String login(ModelAndView modelAndView) {
        return "login";
    }

    @RequestMapping("/banana")
    public String banana(ModelAndView modelAndView) {
        return "banana";
    }

}
