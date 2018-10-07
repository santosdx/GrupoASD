package com.grupoAsd.activos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoAsd.activos.model.Ciudad;
import com.grupoAsd.activos.service.ServicioCiudad;

@RestController
public class CiudadController {

	@Autowired
	private ServicioCiudad servCiudad;
	
	@RequestMapping(value = "/ciudad/{id}", method = RequestMethod.GET, produces = "application/json")
	public Ciudad getCiudad(@PathVariable Integer id) {
		return servCiudad.buscarCiudadById(id);
	}
	
}
