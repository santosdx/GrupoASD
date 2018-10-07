package com.grupoAsd.activos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoAsd.activos.model.Activo;
import com.grupoAsd.activos.service.ServicioActivo;

@RestController
public class ActivoController {

	@Autowired
	private ServicioActivo servActivo;
	
	@RequestMapping(value = "/activo/{id}", method = RequestMethod.GET, produces = "application/json")
	public Activo getActivo(@PathVariable Integer id) {
		return servActivo.buscarActivoById(id);
	}
	
}
