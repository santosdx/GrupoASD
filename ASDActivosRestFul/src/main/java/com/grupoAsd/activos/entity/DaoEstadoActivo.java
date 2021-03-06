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
 * Clase que representa la entidad de base de datos Estado_Activo.
 * @author santos
 *
 */
@Entity
@Table(name = "\"Estado_Activo\"")
public class DaoEstadoActivo implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_activo_generador")
    @SequenceGenerator(name="estado_activo_generador", sequenceName = "sq_id_estado_activo", allocationSize=1)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nombre")
	private String nombre;

	public DaoEstadoActivo() {
	}

	public DaoEstadoActivo(Integer id) {
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
		return "DaoEstadoActivo[ id=" + id + " ]";
	}

}
