package com.marcos.muroMensajes.datos.mensajes;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MensajeRutas {
	
	
	
	
	@GetMapping("/mensajes")
	public ModelAndView todosLosMensajes() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mensajes");
		mav.addObject("mensajes",new ArrayList<Mensaje>());
		
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
}
