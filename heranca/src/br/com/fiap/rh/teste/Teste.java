package br.com.fiap.rh.teste;

import br.com.fiap.rh.model.Aluno;
import br.com.fiap.rh.model.Professor;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Engenharia de Software", "Otavio", "12345", "54321");
		aluno.getNome();
		aluno.getMatricula();
		aluno.getCpf();
		aluno.getCurso();
		aluno.estudar();
		
		Professor prof = new Professor("Java", "Professor", "098", "890");
		prof.getNome();
		prof.getMatricula();
		prof.getCpf();
		prof.getDisciplina();
		prof.estudar();
		
	}

}
