package com.grupoAsd.activos.converter;

import org.springframework.stereotype.Component;

import com.grupoAsd.activos.entity.DaoEstadoActivo;
import com.grupoAsd.activos.model.EstadoActivo;

@Component
public class ConvertidorDaoEstadoActivo {

	public EstadoActivo convertirDaoEstadoActivoToEstadoActivo(DaoEstadoActivo EstadoActivo) {
		EstadoActivo resultado = new EstadoActivo(EstadoActivo);
		return resultado;
	}
}
