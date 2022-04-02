import java.util.Scanner;

public class Questão03 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		Double nm01, nm02;
		
		System.out.println("Digite o número:");
		nm01 = obter.nextDouble();
		System.out.println("Digite o número:");
		nm02 = obter.nextDouble();
		
		if(nm01 < nm02) {
			System.out.println("Entre os números " + nm01 + " , " + nm02 + " o menor é: " + nm01 );
		}
		else if(nm02 < nm01) {
			System.out.println("Entre os números " + nm01 + " , " + nm02 + " o menor é: " + nm02);
		}
		else {
			System.out.println("Eles são iguais");
		}
		
		obter.close();
	}

}
