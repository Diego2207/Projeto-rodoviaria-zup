package com.br.projeto.onibus.models;

import java.util.List;

public class OnibusModel {
	 
	private String empresa;
	private String destino;
	private String tempoViagem;
	private String acentos;
	private boolean acentosLivres;
	private List<PassagensModel> clientes;
	
	public OnibusModel(String empresa, String destino, String tempoViagem, String acentos) {
		this.empresa = empresa;
		this.destino = destino;
		this.tempoViagem = tempoViagem;
		this.acentos = acentos;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getTempoViagem() {
		return tempoViagem;
	}

	public void setTempoViagem(String tempoViagem) {
		this.tempoViagem = tempoViagem;
	}

	public String getAcentos() {
		return acentos;
	}

	public void setAcentos(String acentos) {
		this.acentos = acentos;
	}

	public boolean isAcentosLivres() {
		return acentosLivres;
	}

	public void setAcentosLivres(boolean acentosLivres) {
		this.acentosLivres = acentosLivres;
	}

	public List<PassagensModel> getClientes() {
		return clientes;
	}

	public void setClientes(List<PassagensModel> clientes) {
		this.clientes = clientes;
	}
	
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("Empresa : "+ this.empresa);
		modelo.append("Destino : "+ this.destino);
		modelo.append("Tempo de viagem :"+ this.tempoViagem);
		modelo.append("Acentos : "+ this.acentos);
		modelo.append("Acentos livres :"+ this.isAcentosLivres());
		
		return modelo.toString();
	}
	
	
	
	
	
	
	
}