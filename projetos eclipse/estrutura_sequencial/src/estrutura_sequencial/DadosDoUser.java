package estrutura_sequencial;

import java.util.Scanner;

public class DadosDoUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		float meses;
		
		System.out.println("Qual seu nome ?");
		nome = sc.nextLine();
		
		System.out.printf("%s quantos anos você tem ?\n", nome);
		idade = sc.nextInt();
		
		meses = idade * 12;
		
		System.out.printf("%s você sabia que tem %.2f meses de vida ?", nome, meses);
		sc.close();
	}

}
