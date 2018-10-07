package com.grupoAsd.activos.converter;

import org.springframework.stereotype.Component;

import com.grupoAsd.activos.entity.DaoPropietarioActivo;
import com.grupoAsd.activos.model.PropietarioActivo;

@Component
public class ConvertidorDaoPropietarioActivo {

	public PropietarioActivo convertirDaoPropietarioActivoToPropietarioActivo(DaoPropietarioActivo PropietarioActivo) {
		PropietarioActivo resultado = new PropietarioActivo(PropietarioActivo);
		return resultado;
	}
}
