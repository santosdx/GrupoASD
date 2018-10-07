package com.grupoAsd.activos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoAsd.activos.model.PropietarioActivo;
import com.grupoAsd.activos.service.ServicioPropietarioActivo;

@RestController
public class PropietarioActivoController {

	@Autowired
	private ServicioPropietarioActivo servPropietarioActivo;
	
	/**
	 * Servicio rest que consulta en la base de datos un Propietario de un Activo por su Id y retorna un Json con la información del PropietarioActivo.
	 * @param id
	 * @return PropietarioActivo
	 */
	@GetMapping(value = "/propietario/id/{id}", produces = "application/json")
	public PropietarioActivo getPropietarioActivo(@PathVariable Integer id) {
		return servPropietarioActivo.buscarPropietarioActivoById(id);
	}

	/**
	 *  Servicio rest que permite crear un nuevo Activo en la base de datos.
	 * @param idActivo
	 * @param idPersona
	 * @param idArea
	 * @return PropietarioActivo
	 */
	@PutMapping(value = "/activo/propietario/asignar/{idActivo}/{idPersona}/{idArea}", produces = "application/json")
	public PropietarioActivo createPropietarioActivo(@PathVariable Integer idActivo, @PathVariable Integer idPersona, @PathVariable Integer idArea) {
		return servPropietarioActivo.crear(idActivo, idPersona, idArea);
	}
}
