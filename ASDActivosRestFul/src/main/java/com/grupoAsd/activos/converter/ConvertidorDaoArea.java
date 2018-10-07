package com.grupoAsd.activos.converter;

import org.springframework.stereotype.Component;

import com.grupoAsd.activos.entity.DaoArea;
import com.grupoAsd.activos.model.Area;

@Component
public class ConvertidorDaoArea {

	public Area convertirDaoAreaToArea(DaoArea Area) {
		Area resultado = new Area(Area);
		return resultado;
	}
}
