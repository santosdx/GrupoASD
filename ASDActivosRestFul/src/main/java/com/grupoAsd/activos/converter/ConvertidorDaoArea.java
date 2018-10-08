package com.grupoAsd.activos.converter;

/**
 * Clase que permite realizar las conversiones de datos de tipo DaoArea a
 * Area.
 * 
 * @author santos
 *
 */
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.grupoAsd.activos.entity.DaoArea;
import com.grupoAsd.activos.model.Area;

@Component
public class ConvertidorDaoArea {

	/**
	 * Método que convierte una lista de objetos de tipo DaoArea en una lista de
	 * objetos Area
	 * 
	 * @param area
	 * @return List-Areas
	 */
	public List<Area> convertirDaoAreasToAreas(List<DaoArea> areas) {
		List<Area> resultado = new ArrayList<>();
		for (DaoArea area : areas) {
			resultado.add(new Area(area));
		}
		return resultado;
	}

	/**
	 * Método que convierte un objeto de tipo DaoActivo en un objeto Activo
	 * 
	 * @param area
	 * @return List-Area
	 */
	public Area convertirDaoAreaToArea(DaoArea area) {
		Area resultado = new Area(area);
		return resultado;
	}
}
