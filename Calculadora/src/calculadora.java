import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Informe o primeiro valor: ");
		double n1 = obter.nextDouble();
		System.out.println("Informe o segundo valor: ");
		double n2 = obter.nextDouble();
		
		System.out.println("######SELECIONE UMA OPERA??O######");
		System.out.println("[1] - SOMA");
		System.out.println("[2] - SUBTRA??O");
		System.out.println("[3] - MULTIPLICA??O");
		System.out.println("[4] - DIVIS?O");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>Digite a sua op??o: ");
		Integer op = obter.nextInt();
		
		double  soma;
		double  subtracao;
		double  multiplicacao;
		double  divisao;
		
		switch(op) {
		case 1:
			soma = n1 + n2;
			System.out.println("SOMA: " + soma);
			break;
		case 2:
			subtracao = n1 - n2;
			System.out.println("SUBTRA??O: " + subtracao);
			break;
		case 3:
			multiplicacao = n1 * n2;
			System.out.println("MULTIPLICA??O: " + multiplicacao);
			break;
		case 4:
			if(n1<n2) {
				System.out.println("Impossivel de realizar o calculo");
			}
			else {
				divisao = n1 / n2;
				System.out.println("DIVIS?O: " + divisao);
				break;
			}
			default:
				System.out.println("OPERA??O INVALIDA");
				
				obter.close();
												
		}
	}
}
