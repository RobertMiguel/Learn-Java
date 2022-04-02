import java.util.Scanner;

public class Questão02 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		Double nota01, nota02;
		Double media;
		
		System.out.println("Digite a primeira nota:");
		nota01 = obter.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota02 = obter.nextDouble();
		
		media = (nota01+nota02)/2;
		
		System.out.println("Media é: " + media);
		
		if(media >= 7 && media < 10) {
			System.out.println("APROVADO");
		}
		if(media >= 0 && media < 3) {
			System.out.println("REPROVADO");
		}
		else if(media >= 3 && media < 7) {
			System.out.println("EXAME");
		}
		
		obter.close();
	}

}
