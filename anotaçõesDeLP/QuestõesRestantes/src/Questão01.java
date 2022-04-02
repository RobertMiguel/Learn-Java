import java.util.Scanner;

public class Questão01 {
	
	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		
		int D, n1, n2, n3, n4, grupo;
		
		for(D = 1; D <= 5; D++) {
			System.out.println("Digite o primeiro número:");
			n1 = obter.nextInt();
			System.out.println("Digite o segundo número:");
			n2 = obter.nextInt();
			System.out.println("Digite o terceiro número:");
			n3 = obter.nextInt();
			System.out.println("Digite o quarto número:");
			n4 = obter.nextInt();
			
			if((n1 == n2)&&(n1 == n3)&&(n1 == n4)&&(n2 == n3)&&(n2 ==n4)) {
				System.out.println("Eles são iguas");
			}
		}
		
	}

}
