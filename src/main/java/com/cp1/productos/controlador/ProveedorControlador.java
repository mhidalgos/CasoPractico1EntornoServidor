package com.cp1.productos.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cp1.productos.modelo.Proveedor;
import com.cp1.productos.servicios.ProveedorServicio;

@Controller
@RequestMapping("/proveedores")
public class ProveedorControlador {
	@Autowired
	private ProveedorServicio proveedorServicio;
	
	@GetMapping("")
	public String mostrar(Model model) {
		model.addAttribute("proveedor", proveedorServicio.findAll());
		return "proveedores/mostrar";
	}
	
	@GetMapping("/crear")
	public String crear () {
		return "proveedores/crear";
	}

	@PostMapping("/guardar")
	public String guardar(Proveedor proveedor) {
		proveedorServicio.save(proveedor);
		return "redirect:/proveedor";
	}
}
