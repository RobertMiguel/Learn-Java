import java.util.Scanner;

public class Quest?o12 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Valor do sal?rio m?nimo: R$ ");
		Double vlMinimo = obter.nextDouble();
		System.out.println("Valor do sal?rio atual: R$ ");
		Double vlAtual = obter.nextDouble();
		
		Double quantidaGanha = vlAtual/vlMinimo;
		
		System.out.println("Quantidade de sal?rios que recebe ?: " + quantidaGanha);
		
		obter.close();

	}

}
