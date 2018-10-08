package com.grupoAsd.activos.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
 * Clase que representa la entidad de base de datos Activo.
 * @author santos
 *
 */
@Entity
@Table(name = "\"Activo\"")
public class DaoActivo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "activo_generador")
    @SequenceGenerator(name="activo_generador", sequenceName = "sq_activo", allocationSize=1)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "serial")
    private String serial;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "valor_compra")
    private BigInteger valorCompra;
    @Column(name = "fecha_compra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCompra;
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Column(name = "peso")
    private Integer peso;
    @Column(name = "color")
    private String color;
    @Column(name = "alto")
    private Integer alto;
    @Column(name = "ancho")
    private Integer ancho;
    @Column(name = "largo")
    private Integer largo;
    @JoinColumn(name = "id_estado_activo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DaoEstadoActivo idEstadoActivo;
    @JoinColumn(name = "id_tipo_activo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DaoTipoActivo idTipoActivo;

    public DaoActivo() {
    }

    public DaoActivo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigInteger getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(BigInteger valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public DaoEstadoActivo getIdEstadoActivo() {
        return idEstadoActivo;
    }

    public void setIdEstadoActivo(DaoEstadoActivo idEstadoActivo) {
        this.idEstadoActivo = idEstadoActivo;
    }

    public DaoTipoActivo getIdTipoActivo() {
        return idTipoActivo;
    }

    public void setIdTipoActivo(DaoTipoActivo idTipoActivo) {
        this.idTipoActivo = idTipoActivo;
    }

    @Override
    public String toString() {
        return "DaoActivo[ id=" + id + " ]";
    }
    
}
