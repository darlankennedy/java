package com.br.entities;

import com.br.interfaces.ICarros;

public class Carro  implements ICarros{
	
	private String numChassi;
	private Double velocidadeMaxima;
	private Double quilometragem;
	private Double potencia;
	private String cor;
	private String modelo;
	private Integer quantidadePortas;
	private Double velocidade;
	private Integer marcha = 1 | 2 | 4 | 5;
	private Boolean ligado;
	
	
	
	public Carro(String modelo, String numChassi, double velocidadeMaxima, String cor) {
		super();
		this.modelo = modelo;
		this.numChassi = numChassi;
		this.velocidadeMaxima = velocidadeMaxima;
		this.cor = cor;
	}
	
	
	public Carro(String numChassi, Double velocidadeMaxima, Double quilometragem, Double potencia, String cor,
			String modelo, Integer quantidadePortas, Double velocidade, Integer marcha, Boolean ligado) {
		super();
		
		this.numChassi = numChassi;
		this.velocidadeMaxima = velocidadeMaxima;
		this.quilometragem = quilometragem;
		this.potencia = potencia;
		this.cor = cor;
		this.modelo = modelo;
		this.quantidadePortas = quantidadePortas;
		this.velocidade = velocidade;
		this.marcha = marcha;
		this.ligado = ligado;
	}
	
	public Carro(String numChassi) {
		this.numChassi = numChassi;
		this.velocidadeMaxima = 180.00;
		this.quilometragem = 0.0;
		this.potencia = 80.00;
		this.cor = "branco";
		this.quantidadePortas = 4;
		this.velocidade = 0.0;
		this.marcha = 0;
		this.ligado = false;
	}


	public Carro() {
		super();
	}
	

	
	public String getNumChassi() {
		return numChassi;
	}


	public void setNumChassi(String numChassi) {
		this.numChassi = numChassi;
	}


	public Double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}


	public void setVelocidadeMaxima(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}


	public Double getQuilometragem() {
		return quilometragem;
	}


	public void setQuilometragem(Double quilometragem) {
		this.quilometragem = quilometragem;
	}


	public Double getPotencia() {
		return potencia;
	}


	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Integer getQuantidadePortas() {
		return quantidadePortas;
	}


	public void setQuantidadePortas(Integer quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}


	public Double getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}


	public Integer getMarcha() {
		return marcha;
	}


	public void setMarcha(Integer marcha) {
		this.marcha = marcha;
	}


	public Boolean getLigado() {
		return ligado;
	}


	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}


	@Override
	public String imprimir() {
	
		return "Modelo: "+this.modelo+"\n"
				+"Cor: "+this.cor+"\n"
				+"numChassi : "+this.numChassi+"\n"
				+"Velocidade Maxima: "+this.velocidadeMaxima+" KM";
		
	}



	

	@Override
	public void subirMarcha(int macha) {
		// TODO Auto-generated method stub
		
		switch (macha) {
			case 1:
				this.velocidadeMaxima =  20.0;
			break;
			case 2:
				this.velocidadeMaxima =  30.0;
			break;
			case 3:
				this.velocidadeMaxima =  40.0;
			break;
			case 4:
				this.velocidadeMaxima =  65.0;
			break;
			default:
				this.velocidadeMaxima = this.velocidade;
			break;
		}
	}


	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.ligado = true;
	}


	@Override
	public void desligar() {
		this.ligado = false;
	}


	@Override
	public Double acelerar() {
		// TODO Auto-generated method stub
		return this.velocidade = this.velocidade + 5;
	}


	@Override
	public Double frear() {
		// TODO Auto-generated method stub
		return this.velocidade = this.velocidade - 5;
	}


	@Override
	public void girarVolante() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void reduzirMarcha() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
