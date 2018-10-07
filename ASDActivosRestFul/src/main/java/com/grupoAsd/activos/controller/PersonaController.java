package com.grupoAsd.activos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoAsd.activos.model.Persona;
import com.grupoAsd.activos.service.ServicioPersona;

@RestController
public class PersonaController {

	@Autowired
	private ServicioPersona servPersona;
	
	@RequestMapping(value = "/persona/{id}", method = RequestMethod.GET, produces = "application/json")
	public Persona getPersona(@PathVariable Integer id) {
		return servPersona.buscarPersonaById(id);
	}
	
}
