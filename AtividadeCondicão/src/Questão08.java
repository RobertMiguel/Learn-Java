import java.util.Scanner;

public class Questão08 {
	public static final double PERCENTE_AUMENTO_ATE_300 = 0.35;
	public static final double PERCENTE_AUMENTO_ACIMA_300 = 0.15;
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o valor do sálario reajustado:");
		Double salario = obter.nextDouble();
		
		Double salarioAte, salarioAcima;
		
		if(salario <= 300) {
			salarioAte = salario+(salario*PERCENTE_AUMENTO_ATE_300);
			System.out.println("Valor do salário atual R$: " + salarioAte);
		}
		else if(salario >= 300) {
			salarioAcima = salario+(salario*PERCENTE_AUMENTO_ACIMA_300);
			System.out.println("Valor do sálario atual R$: " + salarioAcima);
		}
		obter.close();
	}

}
