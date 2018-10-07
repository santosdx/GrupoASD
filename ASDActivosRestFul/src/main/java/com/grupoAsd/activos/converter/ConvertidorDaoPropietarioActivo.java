package com.grupoAsd.activos.converter;

import org.springframework.stereotype.Component;

import com.grupoAsd.activos.entity.DaoPropietarioActivo;
import com.grupoAsd.activos.model.PropietarioActivo;

@Component
public class ConvertidorDaoPropietarioActivo {

	/**
	 * Método que convierte un objeto de tipo DaoPropietarioActivo en un objeto PropietarioActivo
	 * @param propietarioActivo
	 * @return PropietarioActivo
	 */
	public PropietarioActivo convertirDaoPropietarioActivoToPropietarioActivo(DaoPropietarioActivo propietarioActivo) {
		PropietarioActivo resultado = new PropietarioActivo(propietarioActivo);
		return resultado;
	}
}
