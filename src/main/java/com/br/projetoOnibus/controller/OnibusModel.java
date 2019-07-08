package com.br.projetoOnibus.controller;

public class OnibusModel {
	
	private int onibus;
	private String empresa;
	private String destino;
	private int lugaresLivres;
	
	public OnibusModel() {
		
	}
	
	public OnibusModel(int onibus, String empresa, String destino, int lugaresLivres) {
		super();
		this.onibus = onibus;
		this.empresa = empresa;
		this.destino = destino;
		this.lugaresLivres = lugaresLivres;
	}

	public int getOnibus() {
		return onibus;
	}

	public void setOnibus(int onibus) {
		this.onibus = onibus;
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

	public int getLugaresLivres() {
		return lugaresLivres;
	}

	public void setLugaresLivres(int lugaresLivres) {
		this.lugaresLivres = lugaresLivres;
	}

	@Override
	public String toString() {
		StringBuilder registro = new StringBuilder();
		registro.append("Onibus : " + this.onibus);
		registro.append("Empresa: "+ this.empresa);
		registro.append("Destino :"+ this.destino);
		registro.append("Lugares Livres: "+ this.lugaresLivres);
		return registro.toString();
	}
	
}
