package com.cp1.productos.servicios;

import java.util.List;
import java.util.Optional;

import com.cp1.productos.modelo.Proveedor;


public interface ProveedorServicio {
	public Proveedor save (Proveedor proveedor);
	public Optional <Proveedor> get (Long id);
	public void update (Proveedor proveedor);
	public List<Proveedor> findAll();
}
