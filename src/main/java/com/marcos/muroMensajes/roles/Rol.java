package com.marcos.muroMensajes.roles;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


import com.marcos.muroMensajes.datos.usuarios.Usuario;




@Entity
public class Rol   {

	
	@Id
	private String rol;
	
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(	name = "permisos",
	  			joinColumns = @JoinColumn(name = "FK_roles"), 
	  			inverseJoinColumns = @JoinColumn(name = "FK_usuarios"))
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	
	

	
	
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


	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Rol [rol=" + rol + "]";
	}



	
	
	
	
	
}
