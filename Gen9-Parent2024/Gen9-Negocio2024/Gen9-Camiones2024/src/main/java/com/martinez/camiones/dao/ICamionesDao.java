package com.martinez.camiones.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martinez.camiones.models.Camion;

public interface ICamionesDao extends JpaRepository<Camion, Long> {

}
