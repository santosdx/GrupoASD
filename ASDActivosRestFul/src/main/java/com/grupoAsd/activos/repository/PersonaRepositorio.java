package com.grupoAsd.activos.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoAsd.activos.entity.DaoPersona;

@Repository
public interface PersonaRepositorio extends JpaRepository<DaoPersona, Serializable> {

	/**
	 * Método que consulta en la base de datos todos las Personas
	 * 
	 * @return List-DaoPersona
	 */
	public abstract List<DaoPersona> findAll();

	/**
	 * Método que consulta en la base de datos un Area por su Id
	 * 
	 * @param id
	 * @return DaoArea
	 */
	public abstract DaoPersona findById(Integer id);
}
