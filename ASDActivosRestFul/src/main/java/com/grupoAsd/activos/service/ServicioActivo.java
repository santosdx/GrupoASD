package com.grupoAsd.activos.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoAsd.activos.converter.ConvertidorDaoActivo;
import com.grupoAsd.activos.entity.DaoActivo;
import com.grupoAsd.activos.entity.DaoEstadoActivo;
import com.grupoAsd.activos.entity.DaoTipoActivo;
import com.grupoAsd.activos.model.Activo;
import com.grupoAsd.activos.model.EstadoActivo;
import com.grupoAsd.activos.model.TipoActivo;
import com.grupoAsd.activos.repository.ActivoRepositorio;
import com.grupoAsd.activos.repository.EstadoActivoRepositorio;

/**
 * Clase que inyecta de la capa de repositorio de la tabla Activo, para permitir
 * implementar los metodos a nivel de capa de servicio.
 * 
 * @author santos
 *
 */
@Service
public class ServicioActivo {

	private static final Logger logger = LoggerFactory.getLogger(ServicioActivo.class);

	@Autowired
	private ActivoRepositorio repoActivo;
	@Autowired
	private ConvertidorDaoActivo convActivo;

	@Autowired
	private EstadoActivoRepositorio repoEstadoActivo;

	/**
	 * Método que consulta en la base de datos todos los Activos
	 * 
	 * @return List-Activo
	 */
	public List<Activo> buscarTodosLosActivos() {
		List<Activo> respuesta = null;
		try {
			respuesta = convActivo.convertirDaoActivosToActivos(repoActivo.findAll());
			// logger.info(respuesta.size()+"");
			return respuesta;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}

	/**
	 * Método que consulta en la base de datos un Activo por su Id
	 * 
	 * @param id
	 * @return Activo
	 */
	public Activo buscarActivoById(Integer id) {
		Activo respuesta = null;
		try {
			respuesta = convActivo.convertirDaoActivoToActivo(repoActivo.findById(id));
			return respuesta;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}

	/**
	 * Método que consulta en la base de datos un Activo por su Tipo
	 * 
	 * @param id
	 * @return Activo
	 */
	public List<Activo> buscarActivosByTipo(Integer tipo) {
		List<Activo> respuesta = null;
		try {
			respuesta = convActivo.convertirDaoActivosToActivos(repoActivo.buscarByTipo(tipo));
			return respuesta;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}

	/**
	 * Método que consulta en la base de datos un Activo por su Tipo
	 * 
	 * @param id
	 * @return Activo
	 */
	public List<Activo> buscarActivosByTipo(DaoTipoActivo tipo) {
		List<Activo> respuesta = null;
		try {
			respuesta = convActivo.convertirDaoActivosToActivos(repoActivo.findByIdTipoActivo(tipo));
			return respuesta;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}

	/**
	 * Método que permite crear un nueva entidad de tipo Activo en la base de datos
	 * 
	 * @param activo
	 * @return Activo
	 */
	public Activo crear(DaoActivo activo) {
		Activo respuesta = null;
		try {
			respuesta = convActivo.convertirDaoActivoToActivo(repoActivo.save(activo));
			return respuesta;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}

	/**
	 * Método que permite editar una entidad de tipo Activo en la base de datos
	 * 
	 * @param activo
	 * @return Activo
	 */
	public Activo editar(DaoActivo activo) {
		Activo respuesta = null;
		try {
			respuesta = convActivo.convertirDaoActivoToActivo(repoActivo.save(activo));
			return respuesta;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}

	/**
	 * Método que permite editar el atributo serial a una entidad de tipo Activo en
	 * la base de datos
	 * 
	 * @param id
	 * @param serial
	 * @return Activo
	 */
	public Activo editarSerialAcivoById(Integer id, String serial) {
		Activo respuesta = null;
		try {
			DaoActivo activoEditar = repoActivo.findById(id);
			if (activoEditar != null) {
				activoEditar.setSerial(serial);
				respuesta = convActivo.convertirDaoActivoToActivo(repoActivo.save(activoEditar));
			}
			return respuesta;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}

	/**
	 * Método que permite editar el atributo fecha_baja a una entidad de tipo Activo
	 * en la base de datos
	 * 
	 * @param id
	 * @param fechaBaja
	 * @return Activo
	 */
	public Activo editarFechaBajaAcivoById(Integer id, Date fechaBaja) {
		Activo respuesta = null;
		try {
			DaoActivo activoEditar = repoActivo.findById(id);
			if (activoEditar != null) {
				// logger.info(activoEditar.getFechaCompra() + " --- " + fechaBaja);
				if (activoEditar.getFechaCompra().before(fechaBaja)) {
					activoEditar.setFechaBaja(fechaBaja);
					activoEditar.setIdEstadoActivo(repoEstadoActivo.findById(3));
					respuesta = convActivo.convertirDaoActivoToActivo(repoActivo.save(activoEditar));
				}
			}
			return respuesta;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}

	/**
	 * Método que permite eliminar una entidad de tipo Activo en la base de datos
	 * 
	 * @param id
	 * @return true-false
	 */
	public boolean eliminar(Integer id) {
		boolean respuesta = false;
		try {
			DaoActivo activoEliminar = repoActivo.findById(id);
			if (activoEliminar != null) {
				repoActivo.delete(activoEliminar);
				respuesta = true;
			}
			return respuesta;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return respuesta;
		}
	}
}
