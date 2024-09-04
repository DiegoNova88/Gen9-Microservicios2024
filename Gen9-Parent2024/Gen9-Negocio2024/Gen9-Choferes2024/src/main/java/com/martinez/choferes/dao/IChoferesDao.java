package com.martinez.choferes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martinez.choferes.models.Chofer;

public interface IChoferesDao extends JpaRepository<Chofer, Long>{

}
