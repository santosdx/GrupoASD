package com.grupoAsd.activos.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.grupoAsd.activos.entity.DaoActivo;
import com.grupoAsd.activos.entity.DaoTipoActivo;

/**
 * Clase que se encarga de gestionar todas las operaciones de persistencia de la
 * tabla Activo, para con la base de datos.
 * 
 * @author santos
 *
 */
@Repository
public interface ActivoRepositorio extends JpaRepository<DaoActivo, Serializable> {

	/**
	 * Método que consulta en la base de datos todos los Activos
	 * 
	 * @return List-DaoActivo
	 */
	public abstract List<DaoActivo> findAll();

	/**
	 * Método que consulta en la base de datos un Activo por su Id
	 * 
	 * @param id
	 * @return DaoActivo
	 */
	public abstract DaoActivo findById(Integer id);

	/**
	 * Método que consulta en la base de datos un Activo por su Tipo
	 * 
	 * @param id
	 * @return DaoActivo
	 */
	@Deprecated
	public abstract List<DaoActivo> findByIdTipoActivo(DaoTipoActivo tipo);

	/**
	 * Método que consulta en la base de datos un Activo por su Tipo
	 * 
	 * @param id
	 * @return DaoActivo
	 */
	@Query(value = "SELECT a.* FROM \"Activo\" a WHERE a.id_tipo_activo = :tipo", nativeQuery = true)
	public abstract List<DaoActivo> buscarByTipo(@Param("tipo") Integer tipo);

	/**
	 * Método que permite crear un nueva entidad de tipo Activo en la base de datos
	 * 
	 * @param activo
	 * @return DaoActivo
	 */
	public abstract DaoActivo save(DaoActivo activo);

}
