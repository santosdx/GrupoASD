package com.grupoAsd.activos.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.grupoAsd.activos.entity.DaoPersona;
import com.grupoAsd.activos.model.Persona;

@Component
public class ConvertidorDaoPersona {

	
	/**
	 * Método que convierte una lista de objetos de tipo DaoPersona en una lista de objetos Persona
	 * @param personas
	 * @return List-Personas
	 */
	public List<Persona> convertirDaoPersonasToPersonas(List<DaoPersona> personas){
		List<Persona> resultado = new ArrayList<>();
		for (DaoPersona persona : personas) {
			resultado.add(new Persona(persona));
		}
		return resultado;
	}
	/**
	 * Método que convierte un objeto de tipo DaoPersona en un objeto Persona
	 * @param persona
	 * @return List-Persona
	 */
	public Persona convertirDaoPersonaToPersona(DaoPersona persona) {
		Persona resultado = new Persona(persona);
		return resultado;
	}
}
