package com.grupoAsd.activos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoAsd.activos.model.Area;
import com.grupoAsd.activos.service.ServicioArea;

@RestController
public class AreaController {

	@Autowired
	private ServicioArea servArea;
	
	@RequestMapping(value = "/area/{id}", method = RequestMethod.GET, produces = "application/json")
	public Area getArea(@PathVariable Integer id) {
		return servArea.buscarAreaById(id);
	}
	
}
