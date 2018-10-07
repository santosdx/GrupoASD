package com.grupoAsd.activos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoAsd.activos.model.EstadoActivo;
import com.grupoAsd.activos.service.ServicioEstadoActivo;

@RestController
public class EstadoActivoController {

	@Autowired
	private ServicioEstadoActivo servEstadoActivo;
	
	@RequestMapping(value = "/estado/{id}", method = RequestMethod.GET, produces = "application/json")
	public EstadoActivo getEstadoActivo(@PathVariable Integer id) {
		return servEstadoActivo.buscarEstadoActivoById(id);
	}
	
}
