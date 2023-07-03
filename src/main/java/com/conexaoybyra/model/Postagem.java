package com.conexaoybyra.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min = 3, max = 100, message = "O título deve conter entre 3 e 100 caracteres.")
	private String titulo;
	
	@NotBlank
	@Size(min = 5, max = 1000, message = "O conteúdo deve conter entre 5 e 1000 caracteres.")
	private String conteudo;
	
	@NotBlank
	@Size(min = 1, max = 255)
	private String localizacao;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	@Size(min = 1, max = 255)
	private String midia;

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	
//	Métodos Getters e Setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
		
}