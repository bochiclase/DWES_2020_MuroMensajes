package com.marcos.muroMensajes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class RutasGenericas {
	

	@GetMapping("/")
	public String inicial() {
		
		return "index";
	}
	
	
	@GetMapping("/login")
	public String seguridad() {
		
		return "start";
	}	
	
}
