package com.julian.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
@RequestMapping
	public String Hola(Model model) {
	model.addAttribute("mensaje", "Ejercicio 5 Atos");
	return "vista";
}
}

