package com.grupoAsd.activos.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoAsd.activos.entity.DaoArea;

/**
 * Clase que se encarga de gestionar todas las operaciones de persistencia de la
 * tabla Area, para con la base de datos.
 * 
 * @author santos
 *
 */
@Repository
public interface AreaRepositorio extends JpaRepository<DaoArea, Serializable>{

	/**
	 * Método que consulta en la base de datos todos las Areas
	 * @return List-DaoArea
	 */
	public abstract List<DaoArea> findAll();
	/**
	 * Método que consulta en la base de datos un Area por su Id
	 * @param id
	 * @return DaoArea
	 */
	public abstract DaoArea findById(Integer id);
	
}
