package br.com.tarweb.dto;

import java.sql.Blob;

import br.com.tarweb.model.Equipamento;




public class RequisicaoCadastroEquipamento {

	
	private String marca;
	private String modelo;
	private Blob imagem;
	
	
	public String getMarca() {
		return marca;
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
	public Blob getImagem() {
		return imagem;
	}
	public void setImagem(Blob imagem) {
		this.imagem = imagem;
	}
	public Equipamento toEquipamento() {
		
		Equipamento equipamento = new Equipamento();
		
		equipamento.setMarca(marca);
		equipamento.setModelo(modelo);
		equipamento.setImagem(imagem);
		
		return equipamento;
		
	
	}
	
	
	
	
}
