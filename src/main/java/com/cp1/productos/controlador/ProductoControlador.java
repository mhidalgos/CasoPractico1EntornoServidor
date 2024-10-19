package com.cp1.productos.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cp1.productos.modelo.Producto;
import com.cp1.productos.servicios.ProductoServicio;

@Controller
@RequestMapping("/productos")
public class ProductoControlador {
	
	@Autowired
	private ProductoServicio productoServicio;
	
	@GetMapping("")
	public String mostrar() {
		return "productos/mostrar";
	}
	
	@GetMapping("/crear")
	public String crear () {
		return "productos/crear";
	}

	@PostMapping("/guardar")
	public String guardar(Producto producto) {
		productoServicio.save(producto);
		return "redirect:/productos";
	}
}
