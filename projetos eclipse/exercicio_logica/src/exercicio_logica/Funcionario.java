package exercicio_logica;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		float salario = sc.nextFloat()
		
		System.out.println(numero);
		System.out.println(SalarioToal(horas, salario));

	}
	
	public static String SalarioToal (int horas, float salario) {
		float sal = horas * salario;
		return String.format("%.2f", sal);
	}

}
