package com.br.entities;
import java.util.ArrayList;

import com.br.interfaces.IPessoa;

public class Pessoa implements IPessoa {
	private String Nome;
	private String Cpf;
	private int Idade;
	private Carro carro = new Carro();
	private ArrayList<Carro> carros = new ArrayList<Carro>();

	public Carro getCarro() {
		return carro;
	}


	public void setCarro(Carro carro) {
		this.carro = carro;
	}


	public ArrayList<Carro> getCarros() {
		return carros;
	}


	public void setCarros(ArrayList<Carro> carros) {
		this.carros = carros;
	}


	public String getNome() {
		return Nome;
	}


	public String getCpf() {
		return Cpf;
	}


	public int getIdade() {
		return Idade;
	}


	public Pessoa(String nome, String cpf, int idade, Carro carro, ArrayList<Carro> carros) {
		super();
		this.Nome = nome;
		this.Cpf = cpf;
		this.Idade = idade;
		this.carro = carro;
		this.carros = new ArrayList<Carro>();
	}
	
	
	public Pessoa() {
		super();
	}


	public void setNome(String nome) {
		this.Nome = nome;
	}
	public void setCpf(String cpf) {
		this.Cpf = cpf;
	}
	public void setIdade(int idade) {
		this.Idade = idade;
	}

	
	
	public String imprimir() {
		
		return "Pessoa " 
				+ "Nome: " +this.Nome+"\n"
				+ "Idade: "+ this.Idade+"\n"
				+ "Cpf: " + this.Cpf+"\n"
				+ "Carro: " + this.getCarro().getModelo();
	}
	
	


	
}
