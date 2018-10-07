package com.grupoAsd.activos.converter;

import org.springframework.stereotype.Component;

import com.grupoAsd.activos.entity.DaoActivo;
import com.grupoAsd.activos.model.Activo;

@Component
public class ConvertidorDaoActivo {

	public Activo convertirDaoActivoToActivo(DaoActivo Activo) {
		Activo resultado = new Activo(Activo);
		return resultado;
	}
}
