package com.grupoAsd.activos.converter;

import org.springframework.stereotype.Component;

import com.grupoAsd.activos.entity.DaoEstadoActivo;
import com.grupoAsd.activos.model.EstadoActivo;

/**
 * Clase que permite realizar las conversiones de datos de tipo DaoEstadoActivo a EsatadoActivo.
 * 
 * @author santos
 *
 */
@Component
public class ConvertidorDaoEstadoActivo {

	public EstadoActivo convertirDaoEstadoActivoToEstadoActivo(DaoEstadoActivo EstadoActivo) {
		EstadoActivo resultado = new EstadoActivo(EstadoActivo);
		return resultado;
	}
}
