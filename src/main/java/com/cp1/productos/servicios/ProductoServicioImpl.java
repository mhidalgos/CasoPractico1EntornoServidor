package com.cp1.productos.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp1.productos.modelo.Producto;
import com.cp1.productos.repositorio.ProductoDAO;

@Service
public class ProductoServicioImpl implements ProductoServicio{
	
	@Autowired
	private ProductoDAO productoDAO;
	

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoDAO.save(producto);
	}

	@Override
	public Optional<Producto> get(Long id) {
		// TODO Auto-generated method stub
		return productoDAO.findById(id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		productoDAO.save(producto);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productoDAO.deleteById(id);
	}
	@Override
	public List<Producto> findAll() {
		return productoDAO.findAll();
	}
	public List<Producto> findByNombre(String nombre) {
	    return productoDAO.findByNombreContainingIgnoreCase(nombre);
	}

}
