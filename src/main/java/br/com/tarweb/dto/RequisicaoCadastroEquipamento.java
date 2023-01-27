package br.com.tarweb.dto;

import java.sql.Blob;

import br.com.tarweb.model.Equipamento;




public class RequisicaoCadastroEquipamento {

	
	private String marca;
	private String modelo;
	private String serie;
	private String imagem;
	
	
	public String getMarca() {
		return marca;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public Equipamento toEquipamento() {
		
		Equipamento equipamento = new Equipamento();		
		
		equipamento.setImagem(imagem);		
		equipamento.setMarca(marca);
		equipamento.setModelo(modelo);	
		equipamento.setSerie(serie);
		
		return equipamento;
		
	
	}
	
	
	
	
}
