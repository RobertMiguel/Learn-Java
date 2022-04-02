import java.util.Scanner;

public class rascunho {

	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Informe o primero valor: ");
		Double nm01 = obter.nextDouble();
		System.out.println("Informe o segundo valor: ");
		Double nm02 = obter.nextDouble();
		
		System.out.println("######ESCOLHA SUA OPERAÇÃO######");
		System.out.println("SOMA - [1]");
		System.out.println("SUBTRAÇÃO - [2]");
		System.out.println("MULTIPLICAÇÃO - [3]");
		System.out.println("DIVISÃO - [4]");
		System.out.println("DIGITE O NÚMERO DA OPERAÇÃO: ");
		Integer nmOP = obter.nextInt();
		
		double soma;
		double subtracao;
		double multi;
		double divisao;
		
		switch(nmOP) {
		case 1:
			soma = nm01 + nm02;
			System.out.println("SOMA : " + soma);
			break;
		case 2:
			subtracao = nm01 - nm02;
			System.out.println("SUBTRAÇÃO: " + subtracao);
			break;
		case 3: 
			multi = nm01 * nm02;
			System.out.println("MULTIPLICAÇÃO: " + multi);
			break;
		case 4:
			if(nm01<nm02) {
			System.out.println("Impossivel resolver a operação");
			}
			else { 
				divisao = nm01 / nm02;
				System.out.println("DIVISÃO: " + divisao);
			}
			break;
			
		}
		obter.close();
	}

}
