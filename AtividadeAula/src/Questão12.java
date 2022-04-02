import java.util.Scanner;

public class Questão12 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Valor do salário mínimo: R$ ");
		Double vlMinimo = obter.nextDouble();
		System.out.println("Valor do salário atual: R$ ");
		Double vlAtual = obter.nextDouble();
		
		Double quantidaGanha = vlAtual/vlMinimo;
		
		System.out.println("Quantidade de salários que recebe é: " + quantidaGanha);
		
		obter.close();

	}

}
