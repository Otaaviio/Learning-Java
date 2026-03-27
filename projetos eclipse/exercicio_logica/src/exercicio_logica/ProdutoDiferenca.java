package exercicio_logica;

import java.util.Scanner;

public class ProdutoDiferenca {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
	
		System.out.println(Diferenca(a, b, c, d));
	}
	
	public static int Diferenca(int a, int b, int c, int d) {
		int produtoA = a * b;
		int produtoB = c * d;
		int diferenca = produtoA - produtoB;
		return diferenca;
	}

}
