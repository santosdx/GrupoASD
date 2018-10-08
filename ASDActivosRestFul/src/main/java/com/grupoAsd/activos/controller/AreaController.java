package com.grupoAsd.activos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoAsd.activos.model.Area;
import com.grupoAsd.activos.service.ServicioArea;

/**
 * Clase que describe los servicios de controlador para con las interfaces de
 * negocio para el objeto Area y permite definir los servicios rest.
 * 
 * @author santos
 *
 */
@RestController
public class AreaController {

	@Autowired
	private ServicioArea servArea;
	
	/**
	 * Servicio rest que consulta en la base de datos todos los registros de las Areas, retornando una lista.
	 * @return List-Area
	 */
	@RequestMapping(value = "/areas", method = RequestMethod.GET, produces = "application/json")
	public List<Area> getAllArea() {
		return servArea.buscarTodosLasAreas();
	}
	/**
	 * Servicio rest que consulta en la base de datos un Area por su Id y retorna un Json con la información del Actio.
	 * @param id
	 * @return Area
	 */
	@GetMapping(value = "/area/id/{id}", produces = "application/json")
	public Area getAreaById(@PathVariable Integer id) {
		return servArea.buscarAreaById(id);
	}
}
