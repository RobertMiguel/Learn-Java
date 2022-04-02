import java.util.Scanner;

public class RascunhoQuestão05 {
	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o 1° número:");
		Integer num01 = obter.nextInt();
		System.out.println("Digite o 2° número:");
		Integer num02 = obter.nextInt();
		System.out.println("[1]Média entre os número");
		System.out.println("[2]Diferença entre o maior e o menor");
		System.out.println("[3]Produto entre os números");
		System.out.println("[4]Divisão entre o primeiro e o segundo");
		System.out.println("Digite o número para operação:");
		Integer oprc = obter.nextInt();
		
		Integer media, diferenca, produto, divisao;
		
		if(oprc == 1) {
			media = (num01 +num02 )/2;
			System.out.println("Média é: " + media);
		}
		if(oprc == 2 && num01 > num02) {
			diferenca = num01 - num02;
			System.out.println("Diferença é: " + diferenca);
		}
		if(oprc == 2 && num02 > num01) {
			diferenca = num02 - num01;
			System.out.println("Diferenca é: " + diferenca);
		}
		if(oprc ==3) {
			produto = num01 * num02;
			System.out.println("Produto é: " + produto);
		}
		if(oprc == 4 && num01 > num02) {
			divisao = num01 / num02;
			System.out.println("Divisão é: " + divisao);
		}
		if(oprc == 4 && num02 > num01) {
			divisao = num02 / num01;
			System.out.println("Divisão é: " + divisao);
		}

		obter.close();
	}
}
