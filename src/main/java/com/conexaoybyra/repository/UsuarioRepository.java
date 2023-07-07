package com.conexaoybyra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conexaoybyra.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByEmail(String email);

}
