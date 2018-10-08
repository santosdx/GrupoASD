package com.grupoAsd.activos.model;

import com.grupoAsd.activos.entity.DaoPersona;

/**
 * Clase que represente a nivel de modelo de datos de aplicación el objeto
 * Persona.
 * 
 * @author santos
 *
 */
public class Persona{

    private Integer id;
    private String nombre;
    private String cargo;
    private Area idArea;

    public Persona() {
    }

    public Persona(DaoPersona persona) {
		this.id = persona.getId();
		this.nombre = persona.getNombre();
		this.cargo = persona.getCargo();
		this.idArea = new Area(persona.getIdArea());
	}
    
    public Persona(Integer id, String nombre, String cargo, Area idArea) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cargo = cargo;
		this.idArea = idArea;
	}



	public Persona(Integer id) {
        this.id = id;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Area getIdArea() {
        return idArea;
    }

    public void setIdArea(Area idArea) {
        this.idArea = idArea;
    }

    @Override
    public String toString() {
        return "DaoPersona[ id=" + id + " ]";
    }
    
}
