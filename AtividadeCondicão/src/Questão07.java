import java.util.Scanner;

public class Questão07 {
	public static final double AUMENTO = 0.30;
	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		System.out.print("Digite o salário: R$ ");
		Double salario = obter.nextDouble();
		
		if(salario <= 500.0) {
			Double salarioAtual = salario+(salario*AUMENTO);
			System.out.println("Salário atual é de: R$ " + salarioAtual);
		}
		else {
			System.out.println("Não tem aumento");
		}
		
		obter.close();

	}

}
