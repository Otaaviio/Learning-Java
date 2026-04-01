package br.com.fiap.rh.model;

public class Aluno extends Pessoa{

	private String curso;

	public Aluno(String curso,String nome, String matricula, String cpf) {
		
		super(nome, matricula, cpf);
	
		this.curso = curso;
	}

	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void fazendoProv() {
		System.out.println(this.nome + "esta fazendo prova");
	}
	
	
}
