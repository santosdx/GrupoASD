package com.grupoAsd.activos.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoAsd.activos.converter.ConvertidorDaoArea;
import com.grupoAsd.activos.model.Area;
import com.grupoAsd.activos.repository.AreaRepositorio;

/**
 * Clase que inyecta de la capa de repositorio de la tabla Area, para permitir
 * implementar los metodos a nivel de capa de servicio.
 * 
 * @author santos
 *
 */
@Service
public class ServicioArea {
	
	private static final Logger logger = LoggerFactory.getLogger(ServicioArea.class);	
	
	@Autowired
	private AreaRepositorio repoArea;
	@Autowired 
	private ConvertidorDaoArea convArea;

	/**
	 * Método que consulta en la base de datos todos los Activos
	 * 
	 * @return List-Area
	 */
	public List<Area> buscarTodosLasAreas() {
		List<Area> respuesta = null;
		try {
			respuesta = convArea.convertirDaoAreasToAreas(repoArea.findAll());
			// logger.info(respuesta.size()+"");
			return respuesta;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}

	/**
	 * Método que consulta en la base de datos un Area por su Id
	 * 
	 * @param id
	 * @return Area
	 */
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
