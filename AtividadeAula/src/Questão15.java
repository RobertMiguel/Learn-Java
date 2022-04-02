import java.util.Scanner;

public class Questão15 {

	public static void main(String[] args) {
		
		Scanner naosei = new Scanner (System.in);
		
		System.out.println("Digite a data em que nasceu:");
		Integer data = naosei.nextInt();
		System.out.println("Digite o mês em que nasceu:");
		Integer mes = naosei.nextInt();
		System.out.println("Digite o ano em que nasceu:");
		Integer ano = naosei.nextInt();
		System.out.println("Ano atual:");
		Integer anoatual = naosei.nextInt();
		
		Double result = (double) (data+(mes*30)+(ano+365));
		Double ainda = result-anoatual;
		System.out.println("Resultado :" + ainda);
		
		naosei.close();
	}

}
