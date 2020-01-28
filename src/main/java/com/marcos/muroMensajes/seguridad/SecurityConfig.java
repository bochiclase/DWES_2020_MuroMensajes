package com.marcos.muroMensajes.seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.marcos.muroMensajes.servicios.Autenticacion;


//@Configuration
//@EnableWebSecurity(debug=true)
public class SecurityConfig 

//extends WebSecurityConfigurerAdapter 

{

	
	/*
    @Autowired
    private Autenticacion autenticacion;

    
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        
    	DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(new BCryptPasswordEncoder());
        provider.setUserDetailsService(autenticacion);
    	
    	auth.authenticationProvider(provider);
    }


    
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http.authorizeRequests()
        .anyRequest().authenticated()
        .and()
        .formLogin()
        .and()
        .httpBasic();

    }
    
    */
}