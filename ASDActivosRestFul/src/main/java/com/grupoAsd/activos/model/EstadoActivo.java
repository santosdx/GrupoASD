package com.grupoAsd.activos.model;

import com.grupoAsd.activos.entity.DaoEstadoActivo;

public class EstadoActivo {

	private Integer id;
	private String nombre;

	public EstadoActivo() {

	}

	public EstadoActivo(DaoEstadoActivo EstadoActivo) {
		this.id = EstadoActivo.getId();
		this.nombre = EstadoActivo.getNombre();
	}

	public EstadoActivo(Integer id, String nombre) {
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
		return "EstadoActivo [id=" + id + "]";
	}

}
