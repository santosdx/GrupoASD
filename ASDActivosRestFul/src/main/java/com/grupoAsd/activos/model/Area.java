package com.grupoAsd.activos.model;

import com.grupoAsd.activos.entity.DaoArea;

/**
 * Clase que represente a nivel de modelo de datos de aplicación el objeto
 * Area.
 * 
 * @author santos
 *
 */
public class Area {

	private Integer id;
	private String nombre;
	private Ciudad idCiudad;
	// private Collection<DaoPersona> daoPersonaCollection;
	// private Collection<DaoPropietarioActivo> daoPropietarioActivoCollection;

	public Area() {

	}

	public Area(DaoArea area) {
		this.id = area.getId();
		this.nombre = area.getNombre();
		this.idCiudad = new Ciudad(area.getIdCiudad());
	}

	public Area(Integer id, String nombre, Ciudad idCiudad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idCiudad = idCiudad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(Ciudad idCiudad) {
		this.idCiudad = idCiudad;
	}

	@Override
	public String toString() {
		return "Area [id=" + id + "]";
	}

}
