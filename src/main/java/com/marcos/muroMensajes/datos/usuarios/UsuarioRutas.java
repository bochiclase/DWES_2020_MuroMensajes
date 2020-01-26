package com.marcos.muroMensajes.datos.usuarios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class UsuarioRutas {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@GetMapping("/usuarios")
	public ModelAndView todosLosUsuarios() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("usuarios");
		mav.addObject("user",new Usuario());
		
		List<Usuario> listaUsuarios = (List<Usuario>)usuarioDAO.findAll();
		mav.addObject("usuarios",listaUsuarios);
		
		return mav;
	}
	
	
	
	
	
	@PostMapping("/usuarios/anadir")
	public String usuariosAnadir(@ModelAttribute Usuario usuario) {
		
		
		usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
		usuarioDAO.save(usuario);
		
		return "redirect:/usuarios";
	}
	
	
	
	
	
	@GetMapping("/usuarios/borrar/{id}")
	public String usuariosBorrar(@PathVariable String id) {
		
		usuarioDAO.deleteById(id);
		
		return "redirect:/usuarios";
	}
	
	
	
}
