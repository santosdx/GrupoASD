package com.grupoAsd.activos.repository;

/**
 * Clase que se encarga de gestionar todas las operaciones de persistencia de la
 * tabla Estado_Activo, para con la base de datos.
 * 
 * @author santos
 *
 */
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoAsd.activos.entity.DaoEstadoActivo;

@Repository
public interface EstadoActivoRepositorio extends JpaRepository<DaoEstadoActivo, Serializable>{

	public abstract DaoEstadoActivo findById(Integer id);
}
