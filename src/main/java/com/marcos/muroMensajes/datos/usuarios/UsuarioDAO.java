package com.marcos.muroMensajes.datos.usuarios;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface UsuarioDAO extends CrudRepository<Usuario,String> {

	
}
