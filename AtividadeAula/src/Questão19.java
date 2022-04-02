import java.util.Scanner;

public class Questão19 {
	public static final Double W = 18.0;
	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite as dimensões do 1° comodo(em metros):");
		Double primeiroComodo = obter.nextDouble();
		System.out.println("Digite as dimensões do 2° comodo(em metros):");
		Double segundoComodo = obter.nextDouble();
		
		Double wPrimeiro = primeiroComodo * W;
		Double wSegundo = segundoComodo * W;
		Double wTotal = wPrimeiro+wSegundo;
		
		System.out.println("Total é : " + wTotal);
		
		obter.close();
		
	}

}
