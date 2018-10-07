package com.grupoAsd.activos.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoAsd.activos.converter.ConvertidorDaoActivo;
import com.grupoAsd.activos.model.Activo;
import com.grupoAsd.activos.repository.ActivoRepositorio;

@Service
public class ServicioActivo {
	
	private static final Logger logger = LoggerFactory.getLogger(ServicioActivo.class);	
	
	@Autowired
	private ActivoRepositorio repoActivo;
	@Autowired 
	private ConvertidorDaoActivo convActivo;
	
	public Activo buscarActivoById(Integer id) {
		Activo respuesta = null;
		try {
			respuesta = convActivo.convertirDaoActivoToActivo(repoActivo.findById(id));
			return respuesta;
		}catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}
}
