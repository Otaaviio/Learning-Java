package br.com.zoo.teste;

import br.com.zoo.model.Cachorro;
import br.com.zoo.model.Gato;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Thor", 19);
		Gato gato = new Gato("Miu", 10);
		
		gato.comendo();
		gato.dormir();
		gato.miar();
		
		cachorro.comendo();
		cachorro.dormir();
		cachorro.latir();

	}

}
