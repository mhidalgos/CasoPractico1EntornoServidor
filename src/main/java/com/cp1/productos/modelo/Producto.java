package com.cp1.productos.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	//Esta clase modela los productos que conformarán el catálogo de experiencias
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Identificador único de la experiencia que se genera automáticamente

    private String nombre; // Nombre de la experiencia
    private String descripcion; // Descripción de la experiencia
    private Double precio; // Precio de la experiencia
    private Date fecha; // Fecha de la experiencia
    
    @ManyToOne
    private Proveedor proveedor; //identificador del proveedor
    
    public Producto() {            
    	
    }
    
    
	public Producto(Long id, String nombre, String descripcion, Double precio, Date fecha, Proveedor proveedor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.fecha = fecha;
		this.proveedor = proveedor;
	}


	public Producto(Long id, String nombre, String descripcion, Double precio, Date fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.fecha = fecha;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
    
    
}
