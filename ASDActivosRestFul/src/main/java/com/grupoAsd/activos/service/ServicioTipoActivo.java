package com.grupoAsd.activos.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoAsd.activos.converter.ConvertidorDaoTipoActivo;
import com.grupoAsd.activos.model.TipoActivo;
import com.grupoAsd.activos.repository.TipoActivoRepositorio;

/**
 * Clase que inyecta de la capa de repositorio de la tabla Tipo_Activo, para permitir
 * implementar los metodos a nivel de capa de servicio.
 * 
 * @author santos
 *
 */
@Service
public class ServicioTipoActivo {
	
	private static final Logger logger = LoggerFactory.getLogger(ServicioTipoActivo.class);	
	
	@Autowired
	private TipoActivoRepositorio repoTipoActivo;
	@Autowired 
	private ConvertidorDaoTipoActivo convTipoActivo;
	
	public TipoActivo buscarTipoActivoById(Integer id) {
		TipoActivo respuesta = null;
		try {
			respuesta = convTipoActivo.convertirDaoTipoActivoToTipoActivo(repoTipoActivo.findById(id));
			return respuesta;
		}catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}
}
