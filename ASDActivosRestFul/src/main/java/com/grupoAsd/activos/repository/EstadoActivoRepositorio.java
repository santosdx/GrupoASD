package com.grupoAsd.activos.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoAsd.activos.entity.DaoEstadoActivo;

@Repository
public interface EstadoActivoRepositorio extends JpaRepository<DaoEstadoActivo, Serializable>{

	public abstract DaoEstadoActivo findById(Integer id);
}
