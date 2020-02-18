package com.marcos.muroMensajes.sesiones;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.WebApplicationContext;



@Component
@Scope(	value = WebApplicationContext.SCOPE_SESSION, 
		proxyMode = ScopedProxyMode.TARGET_CLASS)

public class Carrito {
	
	private int productos = 0;
	
	
	public int getProductos() {
		
		return productos;
	}
	
	
	public void addProducto() {
		
		productos++;
	}	
}
