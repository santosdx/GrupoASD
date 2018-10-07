package com.grupoAsd.activos.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoAsd.activos.converter.ConvertidorDaoPersona;
import com.grupoAsd.activos.model.Persona;
import com.grupoAsd.activos.repository.PersonaRepositorio;

@Service
public class ServicioPersona {
	
	private static final Logger logger = LoggerFactory.getLogger(ServicioPersona.class);	
	
	@Autowired
	private PersonaRepositorio repoPersona;
	@Autowired 
	private ConvertidorDaoPersona convPersona;


	/**
	 * Método que consulta en la base de datos todas las Persona
	 * 
	 * @return List-Persona
	 */
	public List<Persona> buscarTodosLasPersonas() {
		List<Persona> respuesta = null;
		try {
			respuesta = convPersona.convertirDaoPersonasToPersonas(repoPersona.findAll());
			return respuesta;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}
	/**
	 * Método que consulta en la base de datos una Persona por su Id
	 * 
	 * @param id
	 * @return Persona
	 */
	public Persona buscarPersonaById(Integer id) {
		Persona respuesta = null;
		try {
			respuesta = convPersona.convertirDaoPersonaToPersona(repoPersona.findById(id));
			return respuesta;
		}catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}
}
