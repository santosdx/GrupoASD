package com.grupoAsd.activos.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoAsd.activos.converter.ConvertidorDaoCiudad;
import com.grupoAsd.activos.model.Ciudad;
import com.grupoAsd.activos.repository.CiudadRepositorio;

/**
 * Clase que inyecta de la capa de repositorio de la tabla Ciudad, para permitir
 * implementar los metodos a nivel de capa de servicio.
 * 
 * @author santos
 *
 */
@Service
public class ServicioCiudad {

	private static final Logger logger = LoggerFactory.getLogger(ServicioCiudad.class);	
	
	@Autowired
	private CiudadRepositorio repoCiudad;
	@Autowired 
	private ConvertidorDaoCiudad convCiudad;
	
	public Ciudad buscarCiudadById(Integer id) {
		Ciudad respuesta = null;
		try {
			respuesta = convCiudad.convertirDaoCiudadToCiudad(repoCiudad.findById(id));
			return respuesta;
		}catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}
}
