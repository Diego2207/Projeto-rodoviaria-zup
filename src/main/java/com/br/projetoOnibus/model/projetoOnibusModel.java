package com.br.projetoOnibus.model;

public class projetoOnibusModel {
	 
	private String empresa;
	private String destino;
	private int tempoViagem;
	private String acentos;
	private String acentosLivres;
	private String clientes;
	
	
	public projetoOnibusModel() {
		
	}
	
	
	public projetoOnibusModel(String empresa, String destino, int tempoViagem, String acentos, String acentosLivres,
			String clientes) {
		super();
		this.empresa = empresa;
		this.destino = destino;
		this.tempoViagem = tempoViagem;
		this.acentos = acentos;
		this.acentosLivres = acentosLivres;
		this.clientes = clientes;
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


	public int getTempoViagem() {
		return tempoViagem;
	}


	public void setTempoViagem(int tempoViagem) {
		this.tempoViagem = tempoViagem;
	}


	public String getAcentos() {
		return acentos;
	}


	public void setAcentos(String acentos) {
		this.acentos = acentos;
	}


	public String getAcentosLivres() {
		return acentosLivres;
	}


	public void setAcentosLivres(String acentosLivres) {
		this.acentosLivres = acentosLivres;
	}


	public String getClientes() {
		return clientes;
	}


	public void setClientes(String clientes) {
		this.clientes = clientes;
	}
		
		public String toString() {
			StringBuilder modelo = new StringBuilder();
			modelo.append("Empresa: " + this.empresa);
			modelo.append("Destino: " + this.destino);
			modelo.append("Tempo de viagem: " + this.tempoViagem);
			modelo.append("Acentos: " + this.acentos);
			modelo.append("Acentos livres:" + this.acentosLivres );
			modelo.append("Cliente: " + this.clientes );
			 return modelo.toString();
		}

}
