import java.util.Scanner;

public class Quest?o05 {
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o 1? n?mero:");
		Integer num01 = obter.nextInt();
		System.out.println("Digite o 2? n?mero:");
		Integer num02 = obter.nextInt();
		System.out.println("###############################");
		System.out.println("[1]M?dia");
		System.out.println("[2]Diferen?a");
		System.out.println("[3]Produto");
		System.out.println("[4]Divis?o");
		System.out.println("Escolha um n?mero para opera??o:");
		Integer oprc = obter.nextInt();
		
		Integer media, diferenca, produt, divicao;
		switch(oprc) {
		case 1: 
			media = (num01 + num02) / 2;
			System.out.println("M?DIA : " + media);
			break;
		case 2: 
			if(num01 > num02) {
				diferenca = num01 - num02;
				System.out.println("DIFEREN?A : " + diferenca);
			}
			else {
					diferenca = num02 - num01;
					System.out.println("DIFEREN?A : " + diferenca);
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
				System.out.println("DIFEREN?A : " + divicao);
			}
			break;
		default:
			System.out.println("Impossivel resolver a operacao");
		}
		obter.close();
		}
}

