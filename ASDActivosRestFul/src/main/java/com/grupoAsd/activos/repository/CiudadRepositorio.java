package com.grupoAsd.activos.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoAsd.activos.entity.DaoCiudad;

/**
 * Clase que se encarga de gestionar todas las operaciones de persistencia de la
 * tabla Ciudad, para con la base de datos.
 * 
 * @author santos
 *
 */
@Repository
public interface CiudadRepositorio extends JpaRepository<DaoCiudad, Serializable>{
	
	public abstract DaoCiudad findById(Integer id);
	public abstract DaoCiudad findByNombre(String nombre);
	public abstract List<DaoCiudad> findAll();
}
