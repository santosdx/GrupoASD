package com.grupoAsd.activos.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoAsd.activos.entity.DaoPersona;

@Repository
public interface PersonaRepositorio extends JpaRepository<DaoPersona, Serializable>{

	public abstract DaoPersona findById(Integer id);
}
