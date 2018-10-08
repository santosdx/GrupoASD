package com.grupoAsd.activos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoAsd.activos.model.TipoActivo;
import com.grupoAsd.activos.service.ServicioTipoActivo;

/**
 * Clase que describe los servicios de controlador para con las interfaces de
 * negocio para el objeto TipoActivo y permite definir los servicios rest.
 * 
 * @author santos
 *
 */
@RestController
public class TipoActivoController {

	@Autowired
	private ServicioTipoActivo servTipoActivo;
	
	@RequestMapping(value = "/tipo/{id}", method = RequestMethod.GET, produces = "application/json")
	public TipoActivo getTipoActivo(@PathVariable Integer id) {
		return servTipoActivo.buscarTipoActivoById(id);
	}
	
}
