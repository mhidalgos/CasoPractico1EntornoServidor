package com.cp1.productos.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre; // Nombre del proveedor
	private String contacto; // Información de contacto (teléfono, email, etc.)
	private String direccion; // Dirección del proveedor
	
	 @OneToMany(mappedBy = "proveedor")
	 private List<Producto> productos; // Lista de experiencias ofrecidas por el proveedor

	    
	public Proveedor () {
		
	}

	public Proveedor(Long id, String nombre, String contacto, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.contacto = contacto;
		this.direccion = direccion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
