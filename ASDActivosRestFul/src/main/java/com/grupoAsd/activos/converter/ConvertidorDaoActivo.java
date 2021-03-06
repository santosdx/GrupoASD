package com.grupoAsd.activos.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.grupoAsd.activos.entity.DaoActivo;
import com.grupoAsd.activos.model.Activo;

/**
 * Clase que permite realizar las conversiones de datos de tipo DaoActivo a
 * Activo.
 * 
 * @author santos
 *
 */
@Component
public class ConvertidorDaoActivo {

	/**
	 * Método que convierte un objeto de tipo DaoActivo en un objeto Activo
	 * 
	 * @param activo
	 * @return Activo
	 */
	public Activo convertirDaoActivoToActivo(DaoActivo activo) {
		Activo resultado = new Activo(activo);
		return resultado;
	}

	/**
	 * Método que convierte una lista de objetos de tipo DaoActivo en una lista de
	 * objetos Activo
	 * 
	 * @param activos
	 * @return List-Activos
	 */
	public List<Activo> convertirDaoActivosToActivos(List<DaoActivo> activos) {
		List<Activo> resultado = new ArrayList<>();
		for (DaoActivo activo : activos) {
			resultado.add(new Activo(activo));
		}
		return resultado;
	}
}
