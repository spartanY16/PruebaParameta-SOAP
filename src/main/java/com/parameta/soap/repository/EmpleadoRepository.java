package com.parameta.soap.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.parameta.soap.entity.Empleado;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, String> {

}
