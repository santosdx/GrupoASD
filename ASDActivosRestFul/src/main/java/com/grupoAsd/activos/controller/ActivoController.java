package com.grupoAsd.activos.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoAsd.activos.entity.DaoActivo;
import com.grupoAsd.activos.entity.DaoTipoActivo;
import com.grupoAsd.activos.model.Activo;
import com.grupoAsd.activos.service.ServicioActivo;

/**
 * Clase que describe los servicios de controlador para con las interfaces de
 * negocio para el objeto Activo y permite definir los servicios rest.
 * 
 * @author santos
 *
 */
@RestController
public class ActivoController {

	@Autowired
	private ServicioActivo servActivo;

	/**
	 * Servicio rest que consulta en la base de datos todos los registros de los
	 * Activos, retornando una lista.
	 * 
	 * @return List-Activo
	 */
	@RequestMapping(value = "/activos", method = RequestMethod.GET, produces = "application/json")
	public List<Activo> getAllActivo() {
		return servActivo.buscarTodosLosActivos();
	}

	/**
	 * Servicio rest que consulta en la base de datos un Activo por su Id y retorna
	 * un Json con la información del Actio.
	 * 
	 * @param id
	 * @return Activo
	 */
	@GetMapping(value = "/activo/id/{id}", produces = "application/json")
	public Activo getActivoById(@PathVariable Integer id) {
		return servActivo.buscarActivoById(id);
	}

	/**
	 * Servicio rest que consulta en la base de datos un Activo por su Id_Tipo
	 * (llave de la tabla tipo_activo) y retorna una lista de Activos.
	 * 
	 * @param id
	 * @return List-Activo
	 */
	@GetMapping(value = "/activo/id_tipo/{id}", produces = "application/json")
	public List<Activo> getActivosByTipo(@PathVariable Integer id) {
		return servActivo.buscarActivosByTipo(id);
	}

	@Deprecated
	@GetMapping(value = "/activo/tipo/{tipo}", produces = "application/json")
	public List<Activo> getActivosByTipo(@PathVariable @Valid DaoTipoActivo tipo) {
		return servActivo.buscarActivosByTipo(tipo);
	}

	/**
	 * Servicio rest que consulta en la base de datos un Activo por su serial
	 * y retorna una lista de Activos.
	 * 
	 * @param serial
	 * @return List-Activo
	 */
	@GetMapping(value = "/activo/serial/{serial}", produces = "application/json")
	public List<Activo> getActivosBySerial(@PathVariable String serial) {
		return servActivo.buscarActivosBySerial(serial);
	}

	/**
	 * Servicio rest que consulta en la base de datos un Activo por su fecha de compra
	 * y retorna una lista de Activos.
	 * 
	 * @param fecha_compra
	 * @return List-Activo
	 */
	@GetMapping(value = "/activo/fecha_compra/{fecha_compra}", produces = "application/json")
	public List<Activo> getActivosByFechaCompra(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha_compra) {
		return servActivo.buscarActivosByFechaCompra(fecha_compra);
	}
	
	/**
	 * Servicio rest que permite crear un nuevo Activo en la base de datos.
	 * 
	 * @param activo
	 * @return Activo
	 */
	@PutMapping(value = "/activo/crear", produces = "application/json")
	public Activo createActivo(@RequestBody @Valid DaoActivo activo) {
		return servActivo.crear(activo);
	}

	/**
	 * Servicio rest que permite editar un Activo en la base de datos.
	 * 
	 * @param activo
	 * @return Activo
	 */
	@PostMapping(value = "/activo/editar", produces = "application/json")
	public Activo editActivo(@RequestBody @Valid DaoActivo activo) {
		return servActivo.editar(activo);
	}

	/**
	 * Servicio rest que permite editar el atributo serial un Activo en la base de
	 * datos.
	 * 
	 * @param activo
	 * @return Activo
	 */
	@PostMapping(value = "/activo/editar/serial/{id}/{serial}", produces = "application/json")
	public Activo editSerialActivo(@PathVariable Integer id, @PathVariable String serial) {
		return servActivo.editarSerialAcivoById(id, serial);
	}

	/**
	 * Servicio rest que permite editar el atributo serial un Activo en la base de
	 * datos.
	 * 
	 * @param activo
	 * @return Activo
	 */
	@PostMapping(value = "/activo/editar/fecha_baja/{id}/{fecha_baja}", produces = "application/json")
	public Activo editFechaBajaActivo(@PathVariable Integer id,
			@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date fecha_baja) {
		return servActivo.editarFechaBajaAcivoById(id, fecha_baja);
	}

	/**
	 * Servicio rest que permite eliminar un Activo en la base de datos.
	 * 
	 * @param id
	 * @return true-false
	 */
	@DeleteMapping(value = "/activo/eliminar/{id}", produces = "application/json")
	public boolean deleteActivo(@PathVariable Integer id) {
		return servActivo.eliminar(id);
	}
}
