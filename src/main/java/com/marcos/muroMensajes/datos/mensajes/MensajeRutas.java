package com.marcos.muroMensajes.datos.mensajes;

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
public class MensajeRutas {
	
	@Autowired
	private MensajeDAO mensajeDAO;
	
	
	@GetMapping("/mensajes")
	public ModelAndView todosLosMensajes() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mensajes");
		mav.addObject("mensaje",new Mensaje());
		
		List<Mensaje> listaMensajes = (List<Mensaje>)mensajeDAO.findAll();
		mav.addObject("mensajes",listaMensajes);
		
		return mav;
	}
	
	
	
	
	
	@PostMapping("/mensajes/anadir")
	public String mensajesAnadir(@ModelAttribute Mensaje mensaje) {
		
		mensajeDAO.save(mensaje);
		
		return "redirect:/mensajes";
	}
	
	
	
	
	
	@GetMapping("/mensajes/borrar/{id}")
	public String mensajesBorrar(@PathVariable long id) {
		
		mensajeDAO.deleteById(id);
		
		return "redirect:/mensajes";
	}
	
	
	
}
