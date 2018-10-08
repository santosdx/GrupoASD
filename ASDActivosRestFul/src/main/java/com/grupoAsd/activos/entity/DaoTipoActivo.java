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
 * Clase que representa la entidad de base de datos Tipo_Activo.
 * @author santos
 *
 */
@Entity
@Table(name = "\"Tipo_Activo\"")
public class DaoTipoActivo implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_activo_generador")
    @SequenceGenerator(name="tipo_activo_generador", sequenceName = "sq_id_tipo_activo", allocationSize=1)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nombre")
	private String nombre;

	public DaoTipoActivo() {
	}

	public DaoTipoActivo(Integer id) {
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

	@Override
	public String toString() {
		return "DaoTipoActivo[ id=" + id + " ]";
	}

}
