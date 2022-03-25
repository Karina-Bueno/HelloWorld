package org.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;

@Entity //tranforma em tabela
@Table(name = "tb_postagens") //nomear a tabela
public class Postagem {
	
	@Id //chave primaria 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremente
	private Long id; //long equivale ao int, tem maior espaço de armazenamento do que o int
	
	@NotNull //obriga que o usuario coloque um titulo na postagem
	private String titulo;
	
	@Size(min = 4, max = 50) // determina um min e um max de caracteres
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;

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

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
}
