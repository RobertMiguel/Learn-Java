import java.util.Scanner;

public class Questão23 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Valor do primeiro ângulo:");
		Double pAngulo = obter.nextDouble();
		System.out.println("Valor do segundo ângulo:");
		Double sAngulo = obter.nextDouble();
		
		Double tAngulo = 180-(pAngulo + sAngulo);
		
		System.out.println("Valor do terceiro ângulo é: " + tAngulo);
		
		
		obter.close();
	}

}
