package com.grupoAsd.activos.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoAsd.activos.entity.DaoActivo;

@Repository
public interface ActivoRepositorio extends JpaRepository<DaoActivo, Serializable>{

	public abstract DaoActivo findById(Integer id);
}
