package com.grupoAsd.activos.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoAsd.activos.converter.ConvertidorDaoPropietarioActivo;
import com.grupoAsd.activos.model.PropietarioActivo;
import com.grupoAsd.activos.repository.PropietarioActivoRepositorio;

@Service
public class ServicioPropietarioActivo {
	
	private static final Logger logger = LoggerFactory.getLogger(ServicioPropietarioActivo.class);	
	
	@Autowired
	private PropietarioActivoRepositorio repoPropietarioActivo;
	@Autowired 
	private ConvertidorDaoPropietarioActivo convPropietarioActivo;
	
	public PropietarioActivo buscarPropietarioActivoById(Integer id) {
		PropietarioActivo respuesta = null;
		try {
			respuesta = convPropietarioActivo.convertirDaoPropietarioActivoToPropietarioActivo(repoPropietarioActivo.findById(id));
			return respuesta;
		}catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}
}
