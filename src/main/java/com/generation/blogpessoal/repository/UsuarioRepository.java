package com.generation.blogpessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	//SELECT * FROM tb_usuarios WHERE usuario = "jacqueline@generarion.com"
	public Optional<Usuario> findByUsuario(String usuario);

}
