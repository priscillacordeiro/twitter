package io.github.priscillacordeiro.twitter;

import java.util.Date;

public class Usuario {

	private String email;
	private String senha;
	private String nome;
	private String nomeUsuario;
	private Date dataNascimento;
	private String bio;
	
	public Usuario(String email, String senha, String nome, String nomeUsuario, Date dataNascimento, String bio) {
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.nomeUsuario = nomeUsuario;
		this.dataNascimento = dataNascimento;
		this.bio = bio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
	
}