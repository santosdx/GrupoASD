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
 * Clase que representa la entidad de base de datos Area.
 * @author santos
 *
 */
@Entity
@Table(name = "\"Area\"")
public class DaoArea implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "area_generador")
    @SequenceGenerator(name="area_generador", sequenceName = "sq_area", allocationSize=1)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@JoinColumn(name = "id_ciudad", referencedColumnName = "id")
	@ManyToOne
	private DaoCiudad idCiudad;

	public DaoArea() {
	}

	public DaoArea(Integer id) {
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

	public DaoCiudad getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(DaoCiudad idCiudad) {
		this.idCiudad = idCiudad;
	}

	@Override
	public String toString() {
		return "DaoArea[ id=" + id + " ]";
	}

}
