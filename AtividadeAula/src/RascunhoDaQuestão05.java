import java.util.Scanner;

public class RascunhoDaQuestão05 {

	public static void main(String[] args) {
	
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o valor do produto:");
		Double produto = obter.nextDouble();
		
		Double precoFinal = produto-(produto*10)/100;
		
		System.out.println("O valor do produto é: R$ " + precoFinal);
		
		obter.close();

	}

}
