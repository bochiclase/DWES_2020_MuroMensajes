package com.marcos.muroMensajes.datos.mensajes;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface MensajeDAO extends CrudRepository<Mensaje,Long> {

	
}
