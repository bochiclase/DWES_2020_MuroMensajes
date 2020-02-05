package com.marcos.muroMensajes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class RutasGenericas {
	

	@GetMapping("/")
	public String inicial(Authentication authentication) {
		
		
	    Iterator<GrantedAuthority> it = (Iterator<GrantedAuthority>) authentication.getAuthorities().iterator(); 
	    while(it.hasNext()) {
	        
	    	GrantedAuthority string = it.next();
	        System.out.println(string.getAuthority());
	    }
		
		
		return "index";
	}
	
	
	@GetMapping("/login")
	public String seguridad() {
		
		return "start";
	}	
	
}
