package com.app.julian.definitivo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@Value("${application.controller.ejercicio3}")
	private String ejercicio3;
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("ejercicio3", this.ejercicio3);
        return "index";
    }
}
