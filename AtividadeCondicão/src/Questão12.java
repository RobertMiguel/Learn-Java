import java.util.Scanner;

public class Questão12 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o valor do salário:");
		Double salario = obter.nextDouble();
		
		Double grat = 0.07;
		Double salComGrat = salario-(salario*grat);
		Double vlDoSal = salComGrat+salario;
		
		Double salGrat350, salGrat75, salGrat50, salGrat35;
		
		double grat100 = 100;
		double grat75 = 75;
		double grat50 = 50;
		double grat35 = 35; 
		if(salComGrat <= 350) {
			salGrat350 = vlDoSal+grat100;
			System.out.println("Valor do salário com gratificação de R$: " + grat100 + " total de R$: " + salGrat350);
		}
		if((salComGrat > 350)&&(salComGrat <=600)) {
			salGrat75 = vlDoSal+grat75;
			System.out.println("Valor do salário com gratificação de R$: " + grat75 + " total de R$: " + salGrat75);
		}
		if((salComGrat >= 600 )&&(salComGrat <= 900)) {
			salGrat50 = vlDoSal+grat50;
			System.out.println("Valor do salário com gratificação de R$: " + grat50 + " total de R$: " + salGrat50);
		}
		if(salComGrat >= 900) {
			salGrat35 = vlDoSal+grat35;
			System.out.println("Valor do salário com gratificação de R$: " + grat35 + " total de R$: " + salGrat35);
		}
		
		obter.close();

	}

}
