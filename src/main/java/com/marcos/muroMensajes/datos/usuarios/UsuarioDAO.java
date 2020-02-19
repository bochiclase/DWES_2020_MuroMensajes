package com.marcos.muroMensajes.datos.usuarios;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


@Repository
public interface UsuarioDAO extends CrudRepository<Usuario,String> {

	
	
		
}
