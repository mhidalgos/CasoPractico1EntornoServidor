package com.cp1.productos.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoControlador {
	
	@GetMapping("")
	public String mostrar() {
		return "productos/mostrar";
	}
	
		

}
