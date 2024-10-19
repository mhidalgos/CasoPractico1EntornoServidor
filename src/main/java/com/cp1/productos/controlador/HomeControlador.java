package com.cp1.productos.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeControlador {

	@GetMapping("")
	public String home () {
		return "home/home";
	}
}
