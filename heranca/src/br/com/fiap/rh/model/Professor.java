package br.com.fiap.rh.model;

public class Professor extends Pessoa{
	
	private String disciplina;

	public Professor(String disciplina, String nome, String matricula, String cpf) {
		
		super(nome, matricula, cpf);
		
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public void ensinar() {
		System.out.println(this.nome + " esta estudando");
	}
	
	public void corrigir() {
		System.out.println(this.nome + " esta corrigindo prova");
	}
}
