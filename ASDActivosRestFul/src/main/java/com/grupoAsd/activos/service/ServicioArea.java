package com.grupoAsd.activos.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoAsd.activos.converter.ConvertidorDaoArea;
import com.grupoAsd.activos.model.Area;
import com.grupoAsd.activos.repository.AreaRepositorio;

@Service
public class ServicioArea {
	
	private static final Logger logger = LoggerFactory.getLogger(ServicioArea.class);	
	
	@Autowired
	private AreaRepositorio repoArea;
	@Autowired 
	private ConvertidorDaoArea convArea;
	
	public Area buscarAreaById(Integer id) {
		Area respuesta = null;
		try {
			respuesta = convArea.convertirDaoAreaToArea(repoArea.findById(id));
			return respuesta;
		}catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}
}
