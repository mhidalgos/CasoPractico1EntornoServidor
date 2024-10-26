package com.cp1.productos.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cp1.productos.modelo.Producto;
import com.cp1.productos.servicios.ProductoServicio;
import com.cp1.productos.servicios.ProveedorServicio;


@Controller
@RequestMapping("/productos")
public class ProductoControlador {
	
	@Autowired
	private ProductoServicio productoServicio;
	
	@Autowired
    private ProveedorServicio proveedorServicio;
	
	@GetMapping("")
	public String mostrar(Model model) {
		model.addAttribute("productos", productoServicio.findAll());
		return "productos/mostrar";
	}
	
	@GetMapping("/crear")
	public String crear (Model model) {
		Producto producto = new Producto();
		model.addAttribute("producto", producto);
		model.addAttribute("proveedores", proveedorServicio.findAll());
		return "productos/crear";
	}

	@PostMapping("/guardar")
	public String guardar(Producto producto) {
		productoServicio.save(producto);
		return "redirect:/productos";
	}
	@GetMapping ("/buscar")
	public String mostrar(@RequestParam(value = "query", required = false) String query, Model model) {
	    List<Producto> productos;
	    if (query != null && !query.isEmpty()) {
	        productos = productoServicio.findByNombre(query);
	    } else {
	        productos = productoServicio.findAll();
	    }
	    model.addAttribute("productos", productos);
	    model.addAttribute("query", query);
	    return "productos/mostrar";
	}
}
