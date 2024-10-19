package com.cp1.productos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cp1.productos.modelo.Proveedor;



@Repository
public interface ProveedorDAO extends JpaRepository <Proveedor, Long> {
	
	
}
