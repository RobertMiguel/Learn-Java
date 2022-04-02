import java.util.Scanner;

public class Questão05 {
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o 1° número:");
		Integer num01 = obter.nextInt();
		System.out.println("Digite o 2° número:");
		Integer num02 = obter.nextInt();
		System.out.println("###############################");
		System.out.println("[1]Média");
		System.out.println("[2]Diferença");
		System.out.println("[3]Produto");
		System.out.println("[4]Divisão");
		System.out.println("Escolha um número para operação:");
		Integer oprc = obter.nextInt();
		
		Integer media, diferenca, produt, divicao;
		switch(oprc) {
		case 1: 
			media = (num01 + num02) / 2;
			System.out.println("MÉDIA : " + media);
			break;
		case 2: 
			if(num01 > num02) {
				diferenca = num01 - num02;
				System.out.println("DIFERENÇA : " + diferenca);
			}
			else {
					diferenca = num02 - num01;
					System.out.println("DIFERENÇA : " + diferenca);
				}
			break;
		case 3: 
			produt = num01 * num02;
			System.out.println("PRODUTO : " + produt);
			break;
		case 4:
			if(num01 < num02) {
				System.out.println("impossible");
			}
			else {
				divicao = num01/num02;
				System.out.println("DIFERENÇA : " + divicao);
			}
			break;
		default:
			System.out.println("Impossivel resolver a operacao");
		}
		obter.close();
		}
}

