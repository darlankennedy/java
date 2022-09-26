package com.br.entities;

import java.util.ArrayList;

import com.br.interfaces.IAluno;

public class Aluno extends Pessoa implements IAluno{
	
	private String sobrenome;
	private String matricula;
	private String nomeCurso;
	private ArrayList<String> disciplinasAprovadas = new ArrayList<String>();
	private ArrayList<Double> notas = new ArrayList<Double>();
	private ArrayList<String> disciplinasMatriculadas = new ArrayList<String>();
	
	
	public Aluno(String nome, String cpf, int idade, Carro carro, ArrayList<Carro> carros, String sobrenome,
			String matricula, String nomeCurso, ArrayList<String> disciplinasAprovadas, ArrayList<Double> notas,
			ArrayList<String> disciplinasMatriculadas) {
		super(nome, cpf, idade, carro, carros);
		this.sobrenome = sobrenome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.disciplinasAprovadas = disciplinasAprovadas;
		this.notas = notas;
		this.disciplinasMatriculadas = disciplinasMatriculadas;
	}
	
	
	
	public Aluno(String nome, String sobrenome,
			String matricula, String nomeCurso) {
		this.setNome(nome);
		this.sobrenome = sobrenome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
	}



	public Aluno(String sobrenome, String matricula, String nomeCurso, ArrayList<String> disciplinasAprovadas,
			ArrayList<Double> notas, ArrayList<String> disciplinasMatriculadas) {
		super();
		this.sobrenome = sobrenome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.disciplinasAprovadas = disciplinasAprovadas;
		this.notas = notas;
		this.disciplinasMatriculadas = disciplinasMatriculadas;
	}



	public Aluno(String nome, String cpf, int idade, Carro carro, ArrayList<Carro> carros) {
		super(nome, cpf, idade, carro, carros);
	}



	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public ArrayList<String> getDisciplinasAprovadas() {
		return disciplinasAprovadas;
	}
	public void setDisciplinasAprovadas(ArrayList<String> disciplinasAprovadas) {
		this.disciplinasAprovadas = disciplinasAprovadas;
	}
	public ArrayList<Double> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}
	public ArrayList<String> getDisciplinasMatriculadas() {
		return disciplinasMatriculadas;
	}
	public void setDisciplinasMatriculadas(ArrayList<String> disciplinasMatriculadas) {
		this.disciplinasMatriculadas = disciplinasMatriculadas;
	}



	@Override
	public void atualizarNome(String str) {
		// TODO Auto-generated method stub
		this.setNome(str);
	}



	@Override
	public void atualizarSobrenome(String str) {
		// TODO Auto-generated method stub
		this.setSobrenome(str);
	}



	@Override
	public void atualizarMatricula(String str) {
		// TODO Auto-generated method stub
		this.setMatricula(str);
		
	}



	@Override
	public void atualizarCurso(String str) {
		// TODO Auto-generated method stub
		this.setNomeCurso(str);
	}



	@Override
	public String imprimirAluno() {
		// TODO Auto-generated method stub
		
		
		String msg = "nome :"+this.getNome()+"\n"+
				"Sobrenome: "+this.sobrenome+"\n"+
				"Matricula: "+this.matricula+"\n"+
				"curso: "+this.nomeCurso;
		
		int count = 0;
		double acon = 0;
		
		if(!this.getNotas().isEmpty()) {
			for (int i = 0; i < this.getNotas().size(); i++) {
				count +=1;
				acon+=this.getNotas().get(i);
				msg += msg + "( Nota : " +(i+1)+") "+this.getNotas().get(i);  
			}	
		}
		
		
		msg += msg + "( media : " +(acon/count)+")";
		
		return msg;
		
				
	}

	
	
	



	

	
}
