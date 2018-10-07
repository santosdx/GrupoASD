package com.grupoAsd.activos.converter;

import org.springframework.stereotype.Component;

import com.grupoAsd.activos.entity.DaoTipoActivo;
import com.grupoAsd.activos.model.TipoActivo;

@Component
public class ConvertidorDaoTipoActivo {

	public TipoActivo convertirDaoTipoActivoToTipoActivo(DaoTipoActivo TipoActivo) {
		TipoActivo resultado = new TipoActivo(TipoActivo);
		return resultado;
	}
}
