package com.br.projeto.onibus.models;

public class PassagensModel {
	
	private String nome;
	private String email;
	private int idade;
	private int quantidadeMalas;
	
	public PassagensModel() {
	}
	
	public PassagensModel(String nome, String email, int idade, int quantidadeMalas) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.quantidadeMalas = quantidadeMalas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getQuantidadeMalas() {
		return quantidadeMalas;
	}
	public void setQuantidadeMalas(int quantidadeMalas) {
		this.quantidadeMalas = quantidadeMalas;
	}
	
	public String toString() {
		StringBuilder xpto = new StringBuilder();
		
		xpto.append("Nome : "+ this.nome);
		xpto.append("Email : "+ this.email);
		xpto.append("Idade : "+ this.idade);
		xpto.append("Quantidade de malas : "+ this.quantidadeMalas);
		
		return xpto.toString();
	}
}
