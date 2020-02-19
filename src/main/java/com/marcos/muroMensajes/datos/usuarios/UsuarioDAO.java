package com.marcos.muroMensajes.datos.usuarios;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


@Repository
public interface UsuarioDAO extends CrudRepository<Usuario,String> {


	@Transactional @Query(value="Update usuario u set usuario='?2'WHERE usuario='?1'",nativeQuery=true)
	void actualizarNombreUsuario(String userViejo,String userNuevo);

	
	
	@Transactional @Query(value="Select * from usuarios where edad=:edad",nativeQuery=true)
	void buscarPorEdad(@Param("edad") Integer anios);
	
	
	
	@Query("from usuarios where edad=:edad")
	void buscarPorEdad2(@Param("edad") Integer anios);
	
	
	
	
	
	
	
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
