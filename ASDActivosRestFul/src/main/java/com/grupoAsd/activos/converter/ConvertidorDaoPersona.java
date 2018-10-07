package com.grupoAsd.activos.converter;

import org.springframework.stereotype.Component;

import com.grupoAsd.activos.entity.DaoPersona;
import com.grupoAsd.activos.model.Persona;

@Component
public class ConvertidorDaoPersona {

	public Persona convertirDaoPersonaToPersona(DaoPersona Persona) {
		Persona resultado = new Persona(Persona);
		return resultado;
	}
}
