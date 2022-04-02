import java.util.Scanner;

public class Questão14 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite a data de nascimento(Quantos anos vc tem):");
		Integer dataNascimento = obter.nextInt();
		System.out.println("Digite o ano atual:");
		Integer anoAtual = obter.nextInt();
		
		Double idadeAnos = (double) (anoAtual - dataNascimento);
		Double idadeMeses = idadeAnos * 12;
		Double idadeDias = idadeAnos *365;
		Double idadeSemanas = idadeDias/7;
		
		System.out.println("Idade em anos: " + idadeAnos);
		System.out.println("Idade meses: " + idadeMeses);
		System.out.println("Idade dias: " + idadeDias);
		System.out.println("Idade semanas: " + idadeSemanas);
		
		obter.close();

	}

}
