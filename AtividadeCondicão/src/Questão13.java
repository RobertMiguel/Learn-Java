import java.util.Scanner;

public class Questão13 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.print("Digite o valor do produto R$:");
		Double produto = obter.nextDouble();
		
		Double porcent5 = 0.05;
		Double percent10 = 0.10;
		Double percent15 = 0.15;
		
		String barato = "Barato";
		String normal = "Normal";
		String caro = "Caro";
		String muitoCaro = "Muito Caro";
		
		if(produto <= 50) {
			Double vlProduto5 = produto+(produto*porcent5);
			System.out.println("Valor do produto é de R$: " + vlProduto5);
			System.out.println("Percentual de aumento de 5% no produto");
		}
		if((produto >= 50)&&(produto <= 100)) {
			Double vlProduto10 = produto+(produto*percent10);
			System.out.println("Valor do produto é de R$: " + vlProduto10);
			System.out.println("Percentual de aumento de 10% no produto");
		}if(produto > 100) {
			Double vlProduto15 = produto+(produto*percent15);
			System.out.println("Valor do produto é de R$: " + vlProduto15);
			System.out.println("Percentual de aumento de 15% no produto");
		}if(produto <= 80) {
			System.out.println(barato);
		}
		if((produto >=80)&&(produto <120)) {
			System.out.println(normal);
		}
		if((produto >= 120)&&(produto <200)) {
			System.out.println(caro);
		}
		if(produto > 200) {
			System.out.println(muitoCaro);
		}
		obter.close();
		}
		

	}

