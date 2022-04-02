import java.util.Scanner;

public class RascunhoDaAula02 {
	
	public static void main (String[]args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o valor do salário : ");
		Double salario = obter.nextDouble();
		
		Double desconto = 11.0;
		Double salarioAtual = salario-((salario*desconto)/100);
		
		System.out.println("Valor do salário é : R$ " + salarioAtual);
		
		
		obter.close();
		
	}
}
