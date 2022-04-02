import java.util.Scanner;

public class Questão24 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.print("Digite a quantidade em reais que você possui: R$ ");
		Double quantR = obter.nextDouble();
		
		Double dolar = quantR / 1.80;
		Double  marcoAlemao = quantR / 2.00;
		Double libraEsterlina = quantR / 3.57;
		
		System.out.println("Valor em dolar é: R$ " + dolar);
		System.out.println("Valor em marco alemão é: R$ "+ marcoAlemao);
		System.out.println("Valor em libra esterlina é: R$ " + libraEsterlina);
		
		obter.close();
	}

}
