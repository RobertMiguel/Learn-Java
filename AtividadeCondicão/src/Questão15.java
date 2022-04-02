import java.util.Scanner;

public class Questão15 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o tipo de investimento (1 para poupança e 2 para fundos de renda fixa)");
		Integer tipo = obter.nextInt();
		System.out.println("Digite o valor R$:");
		Double valor = obter.nextDouble();
		
		Double result01, result02;
		
		if(tipo == 1) {
			result01 = valor+(valor*0.03);
			System.out.println("1 = poupança " + " valor corrigido após um mês R$: " + result01);
		}
		else {
			result02 = valor+(valor*0.04);
			System.out.println("2 = fundos de renda fixa " + " valor corrigido após um mês R$: " + result02);
		}
		obter.close();

	}

}
