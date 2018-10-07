package com.grupoAsd.activos.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoAsd.activos.entity.DaoTipoActivo;

@Repository
public interface TipoActivoRepositorio extends JpaRepository<DaoTipoActivo, Serializable>{

	public abstract DaoTipoActivo findById(Integer id);
}
