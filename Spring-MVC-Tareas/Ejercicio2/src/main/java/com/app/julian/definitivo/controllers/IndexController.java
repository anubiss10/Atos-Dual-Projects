package com.app.julian.definitivo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@Value("${application.controller.holamundo}")
	private String holamundo;
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("holamundo", this.holamundo);
        return "index";
    }
}
