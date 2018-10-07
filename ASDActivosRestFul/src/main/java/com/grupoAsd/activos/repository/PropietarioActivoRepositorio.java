package com.grupoAsd.activos.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoAsd.activos.entity.DaoActivo;
import com.grupoAsd.activos.entity.DaoPropietarioActivo;

@Repository
public interface PropietarioActivoRepositorio extends JpaRepository<DaoPropietarioActivo, Serializable>{

	/**
	 * Método que consulta en la base de datos una relación de Propietario por Activo por su Id
	 * @param id
	 * @return DaoPropietarioActivo
	 */
	public abstract DaoPropietarioActivo findById(Integer id);

	/**
	 * Método que consulta en la base de datos una relación de Propietario por Activo por el Id del Activo
	 * @param activo
	 * @return DaoPropietarioActivo
	 */
	public abstract DaoPropietarioActivo findByIdActivo(DaoActivo activo);
	
	/**
	 * Método que permite crear una nueva relación de un activo con un propietario en la base de datos
	 * 
	 * @param propietarioActivo
	 * @return DaoPropietarioActivo
	 */
	public abstract DaoPropietarioActivo save(DaoPropietarioActivo propietario);
}
