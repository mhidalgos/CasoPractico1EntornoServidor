package com.cp1.productos.modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre; // Nombre del proveedor
	private String contacto; // Información de contacto (teléfono, email, etc.)
	private String direccion; // Dirección del proveedor
	    
	public Proveedor () {
		
	}

	public Proveedor(Long id, String nombre, String contacto, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.contacto = contacto;
		this.direccion = direccion;
	}
	
	

}
