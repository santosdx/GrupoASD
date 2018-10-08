package com.grupoAsd.activos.model;

import java.math.BigInteger;
import java.util.Date;

import com.grupoAsd.activos.entity.DaoActivo;

/**
 * Clase que represente a nivel de modelo de datos de aplicación el objeto
 * Activo.
 * 
 * @author santos
 *
 */
public class Activo {

	private Integer id;
	private String serial;
	private String nombre;
	private String descripcion;
	private BigInteger valorCompra;
	private Date fechaCompra;
	private Date fechaBaja;
	private Integer peso;
	private String color;
	private Integer alto;
	private Integer ancho;
	private Integer largo;
	private EstadoActivo idEstadoActivo;
	private TipoActivo idTipoActivo;

	public Activo() {
	}

	public Activo(DaoActivo activo) {
		this.id = activo.getId();
		this.serial = activo.getSerial();
		this.nombre = activo.getNombre();
		this.descripcion = activo.getDescripcion();
		this.valorCompra = activo.getValorCompra();
		this.fechaCompra = activo.getFechaCompra();
		this.fechaBaja = activo.getFechaBaja();
		this.peso = activo.getPeso();
		this.color = activo.getColor();
		this.alto = activo.getAlto();
		this.ancho = activo.getAncho();
		this.largo = activo.getLargo();
		this.idEstadoActivo = new EstadoActivo(activo.getIdEstadoActivo());
		this.idTipoActivo = new TipoActivo(activo.getIdTipoActivo());
	}

	public Activo(Integer id, String serial, String nombre, String descripcion, BigInteger valorCompra,
			Date fechaCompra, Date fechaBaja, Integer peso, String color, Integer alto, Integer ancho, Integer largo,
			EstadoActivo idEstadoActivo, TipoActivo idTipoActivo) {
		this.id = id;
		this.serial = serial;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.valorCompra = valorCompra;
		this.fechaCompra = fechaCompra;
		this.fechaBaja = fechaBaja;
		this.peso = peso;
		this.color = color;
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
		this.idEstadoActivo = idEstadoActivo;
		this.idTipoActivo = idTipoActivo;
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

	public EstadoActivo getIdEstadoActivo() {
		return idEstadoActivo;
	}

	public void setIdEstadoActivo(EstadoActivo idEstadoActivo) {
		this.idEstadoActivo = idEstadoActivo;
	}

	public TipoActivo getIdTipoActivo() {
		return idTipoActivo;
	}

	public void setIdTipoActivo(TipoActivo idTipoActivo) {
		this.idTipoActivo = idTipoActivo;
	}

	@Override
	public String toString() {
		return "DaoActivo[ id=" + id + " ]";
	}

}
