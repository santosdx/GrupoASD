package com.grupoAsd.activos.converter;

import org.springframework.stereotype.Component;

import com.grupoAsd.activos.entity.DaoTipoActivo;
import com.grupoAsd.activos.model.TipoActivo;

/**
 * Clase que permite realizar las conversiones de datos de tipo DaoTipoActivo a TipoActivo.
 * 
 * @author santos
 *
 */
@Component
public class ConvertidorDaoTipoActivo {

	public TipoActivo convertirDaoTipoActivoToTipoActivo(DaoTipoActivo TipoActivo) {
		TipoActivo resultado = new TipoActivo(TipoActivo);
		return resultado;
	}
}
