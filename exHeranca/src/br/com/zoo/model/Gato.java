package br.com.zoo.model;

public class Gato extends Animal{

	public Gato(String nome, int idade) {
		super(nome, idade);
	}
	
	public void miar() {
		System.out.println(this.nome + " esta miando");
	}
}
