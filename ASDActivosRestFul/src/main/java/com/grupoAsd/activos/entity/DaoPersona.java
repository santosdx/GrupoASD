package com.grupoAsd.activos.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Clase que representa la entidad de base de datos Persona.
 * @author santos
 *
 */
@Entity
@Table(name = "\"Persona\"")
public class DaoPersona implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "persona_generador")
    @SequenceGenerator(name="persona_generador", sequenceName = "sq_persona", allocationSize=1)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "cargo")
	private String cargo;
	@JoinColumn(name = "id_area", referencedColumnName = "id")
	@ManyToOne
	private DaoArea idArea;

	public DaoPersona() {
	}

	public DaoPersona(Integer id) {
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

	public DaoArea getIdArea() {
		return idArea;
	}

	public void setIdArea(DaoArea idArea) {
		this.idArea = idArea;
	}

	@Override
	public String toString() {
		return "DaoPersona[ id=" + id + " ]";
	}

}
