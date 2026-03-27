package exercicio_logica;

import java.util.Scanner;

public class RaioCirculo {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	float circuloA = sc.nextFloat();
	float circuloB = sc.nextFloat();
	float circuloC = sc.nextFloat();
	
	System.out.println(Area(circuloA));
	System.out.println(Area(circuloB));
	System.out.println(Area(circuloC));
	
	sc.close();
	}
	
	public static String Area(double raio) {
		double p = 3.14159;
		double area = p * Math.pow(raio, 2);
		return String.format("%.4f", area);
	}
}