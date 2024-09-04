package com.martinez.rutas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martinez.rutas.models.Ruta;

public interface IRutasDao extends JpaRepository<Ruta, Long>{

}
