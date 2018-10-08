package com.grupoAsd.activos.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoAsd.activos.entity.DaoTipoActivo;

/**
 * Clase que se encarga de gestionar todas las operaciones de persistencia de la
 * tabla Tipo_Activo, para con la base de datos.
 * 
 * @author santos
 *
 */
@Repository
public interface TipoActivoRepositorio extends JpaRepository<DaoTipoActivo, Serializable>{

	public abstract DaoTipoActivo findById(Integer id);
}
