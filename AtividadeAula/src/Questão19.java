import java.util.Scanner;

public class Quest?o19 {
	public static final Double W = 18.0;
	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite as dimens?es do 1? comodo(em metros):");
		Double primeiroComodo = obter.nextDouble();
		System.out.println("Digite as dimens?es do 2? comodo(em metros):");
		Double segundoComodo = obter.nextDouble();
		
		Double wPrimeiro = primeiroComodo * W;
		Double wSegundo = segundoComodo * W;
		Double wTotal = wPrimeiro+wSegundo;
		
		System.out.println("Total ? : " + wTotal);
		
		obter.close();
		
	}

}
