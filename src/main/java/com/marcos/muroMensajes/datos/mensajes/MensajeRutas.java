package com.marcos.muroMensajes.datos.mensajes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MensajeRutas {
	
	@Autowired
	private MensajeDAO mensajeDAO;
	
	
	@GetMapping("/mensajes")
	public ModelAndView todosLosMensajes() {
		
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mensajes");
		
		List<Mensaje> listaMensajes = (List<Mensaje>)mensajeDAO.findAll();
		mav.addObject("mensajes",listaMensajes);
		
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
}
