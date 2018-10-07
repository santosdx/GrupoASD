package com.grupoAsd.activos.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoAsd.activos.entity.DaoPropietarioActivo;

@Repository
public interface PropietarioActivoRepositorio extends JpaRepository<DaoPropietarioActivo, Serializable>{

	public abstract DaoPropietarioActivo findById(Integer id);
}
