package com.ideasbolsa.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ideasbolsa.springboot.app.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
