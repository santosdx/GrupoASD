package com.grupoAsd.activos.model;

import java.util.Date;

import com.grupoAsd.activos.entity.DaoPropietarioActivo;

public class PropietarioActivo {

	private Integer id;
	private Date fechaAsignacion;
	private Date fechaRetiro;
	private Activo idActivo;
	private Area idArea;
	private Persona idPersona;

	public PropietarioActivo() {
	}

	public PropietarioActivo(DaoPropietarioActivo propietario) {

		this.id = propietario.getId();
		this.fechaAsignacion = propietario.getFechaAsignacion();
		this.fechaRetiro = propietario.getFechaRetiro();
		this.idActivo = new Activo(propietario.getIdActivo());
		this.idArea = new Area(propietario.getIdArea());
		this.idPersona = new Persona(propietario.getIdPersona());
	}

	public PropietarioActivo(Integer id, Date fechaAsignacion, Date fechaRetiro, Activo idActivo, Area idArea,
			Persona idPersona) {

		this.id = id;
		this.fechaAsignacion = fechaAsignacion;
		this.fechaRetiro = fechaRetiro;
		this.idActivo = idActivo;
		this.idArea = idArea;
		this.idPersona = idPersona;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	public Date getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(Date fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

	public Activo getIdActivo() {
		return idActivo;
	}

	public void setIdActivo(Activo idActivo) {
		this.idActivo = idActivo;
	}

	public Area getIdArea() {
		return idArea;
	}

	public void setIdArea(Area idArea) {
		this.idArea = idArea;
	}

	public Persona getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}

	@Override
	public String toString() {
		return "DaoPropietarioActivo[ id=" + id + " ]";
	}

}
