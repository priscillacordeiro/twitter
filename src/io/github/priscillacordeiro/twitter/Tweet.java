package io.github.priscillacordeiro.twitter;

import java.time.LocalDateTime;

public class Tweet {
	
	private Usuario autor;
	private String mensagem;
	private LocalDateTime dataPublicacao;
	private int curtidas;
	
	public Tweet(Usuario autor, String mensagem) {
		this.autor = autor;
		this.mensagem = mensagem;
		this.dataPublicacao = LocalDateTime.now();
		this.curtidas = 0;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public LocalDateTime getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDateTime dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
}