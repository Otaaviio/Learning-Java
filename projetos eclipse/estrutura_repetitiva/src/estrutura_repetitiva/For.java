package estrutura_repetitiva;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int target = sc.nextInt();
		
		if (target >= num) {
			System.out.println("O alvo deve ser maior que o número incial");
		} else {
			System.out.println("Contagem");
		}
		
		for (int i; num != target; num++) {
			System.out.println(num);
		}
	}

}
