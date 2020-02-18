package com.marcos.muroMensajes;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.marcos.muroMensajes.servicios.Autenticacion;
import com.marcos.muroMensajes.sesiones.Carrito;




@Controller
public class RutasGenericas {
	
	
	@GetMapping("/")
	public String inicial(HttpSession sesion, ModelMap model, 
			@ModelAttribute Carrito carrito) {
		
		
		sesion.setAttribute("carrito", carrito);
		return "index";
	}
	
	
	

	@GetMapping("/logout")
	public String finalizar(Authentication authentication) {
		
		return "ok";
	}
		
	
	
	@GetMapping("/addCarrito")
	public String carrito(HttpSession sesion,
						@SessionAttribute Carrito carrito) {
		
		
		//Carrito carrito = (Carrito)sesion.getAttribute("carrito");
		System.out.println(carrito);
		if(carrito!=null) {
			carrito.addProducto();

		}
		
		return "redirect:/usuarios";
	}		
	

	
	
	@GetMapping("/login")
	public String seguridad(HttpSession sesion) {
		
		//sesion.setAttribute("carrito", new Carrito());
		
		return "start";
	}	
	
	
	
	
}
