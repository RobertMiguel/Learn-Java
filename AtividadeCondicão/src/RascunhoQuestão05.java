import java.util.Scanner;

public class RascunhoQuest?o05 {
	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o 1? n?mero:");
		Integer num01 = obter.nextInt();
		System.out.println("Digite o 2? n?mero:");
		Integer num02 = obter.nextInt();
		System.out.println("[1]M?dia entre os n?mero");
		System.out.println("[2]Diferen?a entre o maior e o menor");
		System.out.println("[3]Produto entre os n?meros");
		System.out.println("[4]Divis?o entre o primeiro e o segundo");
		System.out.println("Digite o n?mero para opera??o:");
		Integer oprc = obter.nextInt();
		
		Integer media, diferenca, produto, divisao;
		
		if(oprc == 1) {
			media = (num01 +num02 )/2;
			System.out.println("M?dia ?: " + media);
		}
		if(oprc == 2 && num01 > num02) {
			diferenca = num01 - num02;
			System.out.println("Diferen?a ?: " + diferenca);
		}
		if(oprc == 2 && num02 > num01) {
			diferenca = num02 - num01;
			System.out.println("Diferenca ?: " + diferenca);
		}
		if(oprc ==3) {
			produto = num01 * num02;
			System.out.println("Produto ?: " + produto);
		}
		if(oprc == 4 && num01 > num02) {
			divisao = num01 / num02;
			System.out.println("Divis?o ?: " + divisao);
		}
		if(oprc == 4 && num02 > num01) {
			divisao = num02 / num01;
			System.out.println("Divis?o ?: " + divisao);
		}

		obter.close();
	}
}
