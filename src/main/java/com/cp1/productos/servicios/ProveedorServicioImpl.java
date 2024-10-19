package com.cp1.productos.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp1.productos.modelo.Proveedor;
import com.cp1.productos.repositorio.ProveedorDAO;

@Service
public class ProveedorServicioImpl implements ProveedorServicio{

	@Autowired
	private ProveedorDAO proveedorDAO;
	
	@Override
	public Proveedor save(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return  proveedorDAO.save(proveedor);
	}

	@Override
	public Optional<Proveedor> get(Long id) {
		// TODO Auto-generated method stub
		return proveedorDAO.findById(id);
	}

	@Override
	public void update(Proveedor proveedor) {
		// TODO Auto-generated method stub
		proveedorDAO.save(proveedor);
		
	}


	@Override
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return proveedorDAO.findAll();
	}

}
