package com.grupoAsd.activos.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoAsd.activos.converter.ConvertidorDaoActivo;
import com.grupoAsd.activos.converter.ConvertidorDaoArea;
import com.grupoAsd.activos.converter.ConvertidorDaoPersona;
import com.grupoAsd.activos.converter.ConvertidorDaoPropietarioActivo;
import com.grupoAsd.activos.entity.DaoActivo;
import com.grupoAsd.activos.entity.DaoArea;
import com.grupoAsd.activos.entity.DaoPersona;
import com.grupoAsd.activos.entity.DaoPropietarioActivo;
import com.grupoAsd.activos.model.Activo;
import com.grupoAsd.activos.model.Area;
import com.grupoAsd.activos.model.Persona;
import com.grupoAsd.activos.model.PropietarioActivo;
import com.grupoAsd.activos.repository.ActivoRepositorio;
import com.grupoAsd.activos.repository.AreaRepositorio;
import com.grupoAsd.activos.repository.PersonaRepositorio;
import com.grupoAsd.activos.repository.PropietarioActivoRepositorio;

@Service
public class ServicioPropietarioActivo {
	
	private static final Logger logger = LoggerFactory.getLogger(ServicioPropietarioActivo.class);	
	
	@Autowired
	private PropietarioActivoRepositorio repoPropietarioActivo;
	@Autowired 
	private ConvertidorDaoPropietarioActivo convPropietarioActivo;

	@Autowired
	private ActivoRepositorio repoActivo;
	@Autowired 
	private ConvertidorDaoActivo convActivo;

	@Autowired
	private AreaRepositorio repoArea;
	@Autowired 
	private ConvertidorDaoArea convArea;

	@Autowired
	private PersonaRepositorio repoPersona;
	@Autowired 
	private ConvertidorDaoPersona convPersona;
	
	/**
	 * Método que consulta en la base de datos un Propietario de un Activo por su Id
	 * @param id
	 * @return PropietarioActivo
	 */
	public PropietarioActivo buscarPropietarioActivoById(Integer id) {
		PropietarioActivo respuesta = null;
		try {
			logger.info("id_propietario:"+id);
			respuesta = convPropietarioActivo.convertirDaoPropietarioActivoToPropietarioActivo(repoPropietarioActivo.findById(id));
			return respuesta;
		}catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}
/**
	/**
	 * Método que consulta en la base de datos un Propietario de un Activo por el Id del Activo
	 * @param id
	 * @return PropietarioActivo
	 */
/*	public PropietarioActivo buscarPropietarioActivoByIdActivo(Integer id) {
		PropietarioActivo respuesta = null;
		try {
			respuesta = convPropietarioActivo.convertirDaoPropietarioActivoToPropietarioActivo(repoPropietarioActivo.findByIdActivo(id));
			return respuesta;
		}catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}
*/
	
	/**
	 * Método que permite crear una relación de un activo con su propietario en la base de datos
	 * @param idActivo
	 * @param idPersona
	 * @param idArea
	 * @return PropietarioActivo
	 */
	public PropietarioActivo crear(Integer idActivo, Integer idPersona, Integer idArea) {
		PropietarioActivo respuesta = null;
		DaoPropietarioActivo propietarioActividad = null;
		DaoActivo activoAsignar = null;
		DaoPersona personaPropietario = null;
		DaoArea areaPropietario = null;
		
		//logger.info("act:"+idActivo+" per:"+idPersona+" are:"+idArea);
		try {
			activoAsignar = repoActivo.findById(idActivo);
			
			if(activoAsignar != null) {
				
				propietarioActividad = repoPropietarioActivo.findByIdActivo(activoAsignar);
				if(propietarioActividad == null) {
					logger.info("El activo exite!");
					propietarioActividad = new DaoPropietarioActivo();
					propietarioActividad.setIdActivo(activoAsignar);
					propietarioActividad.setFechaAsignacion(new Date());

					if(idPersona != null || idArea != null) {
						personaPropietario = repoPersona.findById(idPersona);
						areaPropietario = repoArea.findById(idArea);
					}
					
					if(personaPropietario != null) {
						logger.info("La persona exite!");
						propietarioActividad.setIdPersona(personaPropietario);
					}
					if(areaPropietario != null) {
						logger.info("El area exite!");
						propietarioActividad.setIdArea(areaPropietario);
					}
					respuesta = convPropietarioActivo.convertirDaoPropietarioActivoToPropietarioActivo(repoPropietarioActivo.save(propietarioActividad));
				}else {
					logger.info("El activo ya tiene un propietario");
				}
			}else {
				logger.info("El activo no existe!");
			}
			return respuesta;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}
}
