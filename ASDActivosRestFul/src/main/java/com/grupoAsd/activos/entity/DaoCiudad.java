package com.grupoAsd.activos.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Clase que representa la entidad de base de datos Ciudad.
 * @author santos
 *
 */
@Entity
@Table(name = "\"Ciudad\"")
public class DaoCiudad implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciudad_generador")
    @SequenceGenerator(name="ciudad_generador", sequenceName = "sq_ciudad", allocationSize=1)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Column(name = "codigo")
	private String codigo;
	@Column(name = "nombre")
	private String nombre;

	public DaoCiudad() {
	}

	public DaoCiudad(Integer id) {
		this.id = id;
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
		return "DaoCiudad[ id=" + id + " ]";
	}

}
