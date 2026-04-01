package br.com.zoo.model;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	public void latir() {
		System.out.println(this.nome + " esta latindo");
	}
}
