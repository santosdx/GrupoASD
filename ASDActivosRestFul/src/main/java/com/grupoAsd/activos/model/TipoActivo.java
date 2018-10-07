package com.grupoAsd.activos.model;

import com.grupoAsd.activos.entity.DaoTipoActivo;

public class TipoActivo {

	private Integer id;
	private String nombre;

	public TipoActivo() {

	}

	public TipoActivo(DaoTipoActivo TipoActivo) {
		this.id = TipoActivo.getId();
		this.nombre = TipoActivo.getNombre();
	}

	public TipoActivo(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "TipoActivo [id=" + id + "]";
	}

}
