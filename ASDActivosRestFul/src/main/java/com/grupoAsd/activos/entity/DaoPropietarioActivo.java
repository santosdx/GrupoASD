package com.grupoAsd.activos.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase que representa la entidad de base de datos Propietario_Activo.
 * @author santos
 *
 */
@Entity
@Table(name = "\"Propietario_Activo\"")
public class DaoPropietarioActivo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "propietario_activo_generador")
    @SequenceGenerator(name="propietario_activo_generador", sequenceName = "sq_propietario_activo", allocationSize=1)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha_asignacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAsignacion;
    @Column(name = "fecha_retiro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRetiro;
    @JoinColumn(name = "id_activo", referencedColumnName = "id")
    @ManyToOne
    private DaoActivo idActivo;
    @JoinColumn(name = "id_area", referencedColumnName = "id")
    @ManyToOne
    private DaoArea idArea;
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    @ManyToOne
    private DaoPersona idPersona;

    public DaoPropietarioActivo() {
    }

    public DaoPropietarioActivo(Integer id) {
        this.id = id;
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

    public DaoActivo getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(DaoActivo idActivo) {
        this.idActivo = idActivo;
    }

    public DaoArea getIdArea() {
        return idArea;
    }

    public void setIdArea(DaoArea idArea) {
        this.idArea = idArea;
    }

    public DaoPersona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(DaoPersona idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "DaoPropietarioActivo[ id=" + id + " ]";
    }
    
}
