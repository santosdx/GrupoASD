package com.grupoAsd.activos.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoAsd.activos.entity.DaoArea;

@Repository
public interface AreaRepositorio extends JpaRepository<DaoArea, Serializable>{

	public abstract DaoArea findById(Integer id);
}
