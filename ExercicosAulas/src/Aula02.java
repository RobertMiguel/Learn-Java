import java.util.Scanner;

public class Aula02 {
	public static void main (String[]args) {
		
		final Double desconto = 0.11; 
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o valor do s?lario : ");
		Double salario = obter.nextDouble();
		
		Double salarioDescont = salario*desconto;
		Double salarioAtual = salario-salarioDescont;
		
		System.out.println("Sal?rio atual ? : R$ " + salarioAtual);
		
		obter.close();
		
	}
}
