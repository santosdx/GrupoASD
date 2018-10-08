package com.grupoAsd.activos.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.grupoAsd.activos.entity.DaoCiudad;
import com.grupoAsd.activos.model.Ciudad;

/**
 * Clase que permite realizar las conversiones de datos de tipo DaoCiudad a Ciudad.
 * 
 * @author santos
 *
 */
@Component
public class ConvertidorDaoCiudad {

	public Ciudad convertirDaoCiudadToCiudad(DaoCiudad ciudad) {
		Ciudad resultado = new Ciudad(ciudad);
		return resultado;
	}

	public List<Ciudad> convertirListaDaoCiudadToListCiudad(List<DaoCiudad> ciudades) {
		List<Ciudad> resultado = new ArrayList<>();
		for (DaoCiudad ciudad : ciudades) {
			resultado.add(new Ciudad(ciudad));
		}
		return resultado;
	}

}
