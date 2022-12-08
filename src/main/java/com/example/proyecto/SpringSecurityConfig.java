package com.example.proyecto;

import org.springframework.beans.factory.annotation.Autowired;

/*
 import java.util.ArrayList;
 import java.util.List;
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
/*

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
*/
import org.springframework.security.web.SecurityFilterChain;

import com.example.proyecto.model.service.UserService;



@Configuration
public class SpringSecurityConfig {

    /*
    @Bean
    public InMemoryUserDetailsManager configureAuthentication() {
        List<UserDetails> listaUsuaros = new ArrayList<>();
        List<GrantedAuthority> rolesClientes = new ArrayList<>();
        List<GrantedAuthority> rolesAdministradores = new ArrayList<>();
    
        rolesClientes.add(new SimpleGrantedAuthority("USER"));
        rolesAdministradores.add(new SimpleGrantedAuthority("ADMIN"));
    
        listaUsuaros.add(new User("administrador", "{noop}12345", rolesAdministradores));
        listaUsuaros.add(new User("harold", "{noop}123", rolesClientes));
    
        return new InMemoryUserDetailsManager(listaUsuaros);
    }
    */
    
    @Autowired
    private UserService userService;

    @Bean
    public static BCryptPasswordEncoder encriptarPassword() {

        return new BCryptPasswordEncoder();
    }
    
    @Autowired
    public void criptografiaPassword(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(encriptarPassword());
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
       // .anyRequest().authenticated()
        .and().formLogin().loginPage("/formulario").defaultSuccessUrl("/",true).permitAll()
        .and().logout().permitAll();
        return http.build();
    }
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() throws Exception {
        return (web) -> web.ignoring().antMatchers("/css/**","js/**","img/**");
    }
}
