package com.grupoAsd.activos.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoAsd.activos.converter.ConvertidorDaoEstadoActivo;
import com.grupoAsd.activos.model.EstadoActivo;
import com.grupoAsd.activos.repository.EstadoActivoRepositorio;

@Service
public class ServicioEstadoActivo {
	
	private static final Logger logger = LoggerFactory.getLogger(ServicioEstadoActivo.class);	
	
	@Autowired
	private EstadoActivoRepositorio repoEstadoActivo;
	@Autowired 
	private ConvertidorDaoEstadoActivo convEstadoActivo;
	
	public EstadoActivo buscarEstadoActivoById(Integer id) {
		EstadoActivo respuesta = null;
		try {
			respuesta = convEstadoActivo.convertirDaoEstadoActivoToEstadoActivo(repoEstadoActivo.findById(id));
			return respuesta;
		}catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}
}
