import java.util.Scanner;

public class Questão01 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		Double nota01, nota02, nota03, nota04, media;
		
		System.out.println("Digite a primeira nota:");
		nota01 = obter.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota02 = obter.nextDouble();
		System.out.println("Digite a terceira nota:");
		nota03 = obter.nextDouble();
		System.out.println("Digite a quarta nota:");
		nota04 = obter.nextDouble();
		
		media = (nota01+nota02+nota03+nota04)/4;
		
		System.out.println("Média é: " + media);
		
		if(media >= 7) {
			System.out.println("APROVADO");
		}
		else {
			System.out.println("REPROVADO");
		}
		
		obter.close();
	}

}
