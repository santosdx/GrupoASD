package com.grupoAsd.activos.model;

import com.grupoAsd.activos.entity.DaoCiudad;

public class Ciudad {

	private Integer id;
	private String codigo;
	private String nombre;

	public Ciudad() {
	}
	
	public Ciudad(DaoCiudad ciudad) {
		this.id = ciudad.getId();
		this.codigo = ciudad.getCodigo();
		this.nombre = ciudad.getNombre();
	}
	
	public Ciudad(Integer id, String codigo, String nombre) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + "]";
	}

}
