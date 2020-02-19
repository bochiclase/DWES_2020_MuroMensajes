package com.marcos.muroMensajes.datos.usuarios;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


@Repository
public interface UsuarioDAO extends CrudRepository<Usuario,String> {

	List<Usuario> findByEdad(Integer edad);
	List<Usuario> findByEdadLessThan(Integer edad);	
	List<Usuario> findByEdadLessThanEqual(Integer edad);	
	
	List<Usuario> findByEdadAndUsuario(Integer edad,String usuario);
	List<Usuario> findByEdadOrUsuario(Integer edad,String usuario);	
	
	List<Usuario> findByUsuarioContaining(String cadena);
	List<Usuario> findByUsuarioEndsWith(String cadena);	
	List<Usuario> findByUsuarioStartsWith(String cadena);	
	
	List<Usuario> findTop3ByEdadGreaterThan(Integer edad);
	
	
	/**************************************************************/
	
	
	Integer countByEdad(Integer edad);
	
	
	
}
