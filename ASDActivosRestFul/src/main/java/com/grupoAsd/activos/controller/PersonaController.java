package com.grupoAsd.activos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoAsd.activos.model.Persona;
import com.grupoAsd.activos.service.ServicioPersona;

/**
 * Clase que describe los servicios de controlador para con las interfaces de
 * negocio para el objeto Persona y permite definir los servicios rest.
 * 
 * @author santos
 *
 */
@RestController
public class PersonaController {

	@Autowired
	private ServicioPersona servPersona;

	
	/**
	 * Servicio rest que consulta en la base de datos todos los registros de las Areas, retornando una lista.
	 * @return List-Persona
	 */
	@RequestMapping(value = "/personas", method = RequestMethod.GET, produces = "application/json")
	public List<Persona> getAllPersonas() {
		return servPersona.buscarTodosLasPersonas();
	}

	/**
	 * Servicio rest que consulta en la base de datos un Area por su Id y retorna un Json con la información del Actio.
	 * @param id
	 * @return Area
	 */
	@GetMapping(value = "/persona/id/{id}", produces = "application/json")
	public Persona getPersona(@PathVariable Integer id) {
		return servPersona.buscarPersonaById(id);
	}
	
}
