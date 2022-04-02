import java.util.Scanner;

public class Questão04 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		float nota01, nota02;
		
		System.out.println("Digite 1° nota:");
		nota01 = obter.nextInt();
		System.out.println("Digite 2° nota:");
		nota02 = obter.nextInt();
		
		float mediaPonderada = (nota01*2)+(nota02*3)/3+2;
		
		System.out.println("Média ponderada é: " + mediaPonderada);
		
		obter.close();

	}

}
