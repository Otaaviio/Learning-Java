package estrutura_repetitiva;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int target = sc.nextInt();
		
		if (num >= target) {
			System.out.println("O alvo deve ser maior que o número");
		} else {
			System.out.println("Vamos começar");
		}
		
		while (num <= target) {
			System.out.println(num);
			num++;
		}
		
		sc.close();
	}

}
