import java.util.Scanner;

public class Quest?o07 {
	public static final double AUMENTO = 0.30;
	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		System.out.print("Digite o sal?rio: R$ ");
		Double salario = obter.nextDouble();
		
		if(salario <= 500.0) {
			Double salarioAtual = salario+(salario*AUMENTO);
			System.out.println("Sal?rio atual ? de: R$ " + salarioAtual);
		}
		else {
			System.out.println("N?o tem aumento");
		}
		
		obter.close();

	}

}
