import java.util.Scanner;

public class rascunho {

	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Informe o primero valor: ");
		Double nm01 = obter.nextDouble();
		System.out.println("Informe o segundo valor: ");
		Double nm02 = obter.nextDouble();
		
		System.out.println("######ESCOLHA SUA OPERA??O######");
		System.out.println("SOMA - [1]");
		System.out.println("SUBTRA??O - [2]");
		System.out.println("MULTIPLICA??O - [3]");
		System.out.println("DIVIS?O - [4]");
		System.out.println("DIGITE O N?MERO DA OPERA??O: ");
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
			System.out.println("SUBTRA??O: " + subtracao);
			break;
		case 3: 
			multi = nm01 * nm02;
			System.out.println("MULTIPLICA??O: " + multi);
			break;
		case 4:
			if(nm01<nm02) {
			System.out.println("Impossivel resolver a opera??o");
			}
			else { 
				divisao = nm01 / nm02;
				System.out.println("DIVIS?O: " + divisao);
			}
			break;
			
		}
		obter.close();
	}

}
