package com.marcos.muroMensajes;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.marcos.muroMensajes.servicios.Autenticacion;
import com.marcos.muroMensajes.sesiones.Carrito;




@Controller
public class RutasGenericas {
	
//	@Resource(name = "carrito")
//    private Carrito carrito;
	
	
	@GetMapping("/")
	public String inicial(HttpSession sesion, ModelMap model) {
		
		return "index";
	}
	
	
	

	@GetMapping("/logout")
	public String finalizar(Authentication authentication) {
		
		return "ok";
	}
		
	
	
	@GetMapping("/addCarrito")
	public String carrito(HttpSession sesion) {
		
		Carrito carrito = (Carrito)sesion.getAttribute("carrito");
		if(carrito!=null) {
			carrito.addProducto();
			//sesion.setAttribute("carrito", carrito);
		}
		
		return "redirect:/";
	}		
	

	
	
	@GetMapping("/login")
	public String seguridad(HttpSession sesion) {
		
		sesion.setAttribute("carrito", new Carrito());
		
		return "start";
	}	
	
	
	
	
}
