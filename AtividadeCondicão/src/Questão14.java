import java.util.Scanner;

public class Questão14 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.print("Digite o valor do salário R$:");
		Double salario = obter.nextDouble();
		
		Double aumento50 = 0.50;
		Double aumento40 = 0.40;
		Double aumento30 = 0.30;
		Double aumento20 = 0.20;
		Double aumento10 = 0.10;
		Double aumento5 = 0.05;
		
		if(salario <= 300) {
			Double vlSalarioAtual01 = salario+(salario*aumento50);
			System.out.println("Valor atual do salário R$: " + vlSalarioAtual01);
			System.out.println("Aumento de 50%");
		}
		if((salario >= 301)&&(salario < 500)) {
			Double vlSalarioAtual02 = salario+(salario*aumento40);
			System.out.println("Valor atual do salário R$: " + vlSalarioAtual02);
			System.out.println("Aumento de 40%");
			}
		if((salario >=501)&&(salario < 700)) {
			Double vlSalarioAtual03 = salario+(salario*aumento30);
			System.out.println("Valor atual do salário R$: " + vlSalarioAtual03);
			System.out.println("Aumento de 30%");
		}
		if((salario >=700)&&(salario < 800)) {
			Double vlSalarioAtual04 = salario+(salario*aumento20);
			System.out.println("Valor atual do salário R$: " + vlSalarioAtual04);
			System.out.println("Auemnto de 20%");
		}
		if((salario >=800)&&(salario < 1000)) {
			Double vlSalarioAtual05 = salario+(salario*aumento10);
			System.out.println("Valor atual do salário R$: " + vlSalarioAtual05);
			System.out.println("Auemnto de 10%");
		}
		if(salario > 1000) {
			Double vlSalarioAtual06 = salario+(salario*aumento5);
			System.out.println("Valor atual do salário R$: " + vlSalarioAtual06);
			System.out.println("Aumento de 5%");
		}
		obter.close();
		}

	}


