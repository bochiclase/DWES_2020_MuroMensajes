package com.marcos.muroMensajes.roles;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PreDestroy;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;

import com.marcos.muroMensajes.datos.usuarios.Usuario;
import com.marcos.muroMensajes.datos.usuarios.UsuarioDAO;




@Entity
public class Rol   {

	
	@Id
	private String nombre = "USER";
	
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy = "rol")
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	
	
/*
	@PreUpdate
	@PostUpdate
	@PreDestroy
	@PrePersist
	@PostPersist
	public void reasignarRolesUsuario() {
		
		// recorrer la lista de usuarios reasignando los roles
		for(Usuario user: usuarios) {
			
			user.setRoles(null);
		}
		
		
		 //también vale esta otra forma
		 //usuarios.forEach(user->user.setRoles(null));
		 
		 
	}
	
	*/
	
	
	
	
	
	
	
	public void addUsuario(Usuario usuario) {

		if(!usuarios.contains(usuario)) {
			
			usuarios.add(usuario);
		}
	}	




	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Rol [rol=" + nombre + "]";
	}



	
	
	
	
	
}
