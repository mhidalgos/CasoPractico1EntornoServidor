package com.cp1.productos.servicios;

import java.util.List;
import java.util.Optional;

import com.cp1.productos.modelo.Producto;

public interface ProductoServicio {
	public Producto save (Producto producto);
	public Optional <Producto> get (Long id);
	public void update (Producto producto);
	public void delete (Long id);
	public List<Producto> findAll();

}
