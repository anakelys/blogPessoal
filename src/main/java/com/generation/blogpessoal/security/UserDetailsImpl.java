package com.generation.blogpessoal.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generation.blogpessoal.model.Usuario;

public class UserDetailsImpl implements UserDetails{

	private static final long serialVersionUID = 1L; 
	//atributo com final: constante 
	// static: limitar dentro da classe 
	// controle de versão para essa classe

	private String userName;
	private String password;
	private List<GrantedAuthority> authorities;
	//autorização que o usuario tem

	//metodo construtor
	public UserDetailsImpl(Usuario user) { 
		this.userName = user.getUsuario();
		this.password = user.getSenha();
	}

	public UserDetailsImpl() {	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return authorities;
	}
	//retornar a senha
	@Override
	public String getPassword() {

		return password;
	}
	//retorna o usuario -> email
	@Override
	public String getUsername() {

		return userName;
	}
	//ajuda a verificar se o acesso já expirou
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	
	//ajuda na validaçao para verificar se o usuario está bloqueado
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	// auxiliar a validar se a credencial expira
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	//validar se o user está ativo
	@Override
	public boolean isEnabled() {
		return true;
	}
}
