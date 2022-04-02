import java.util.Scanner;

public class Questão24 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		

		System.out.println("Digite as horas extras(minutos):");
		float hx = obter.nextFloat();
		System.out.println("Digite as horas faltadas(minutos):");
		float hf = obter.nextFloat();
		
		float h = hx-(2/3 * (hf));
		
		if(h >= 2400) {
			System.out.println("Prêmio de R$: 500");
		}
		else if((h > 1800) &&(h < 2400)) {
			System.out.println("Prêmio de R$: 400");
		}
		else if((h >= 1200)&&(h < 1800)) {
			System.out.println("Prêmio de R$: 300");
		}
		else if((h >= 600)&&(h < 1200)) {
			System.out.println("Prêmio de R$: 200");
		}
		else if(h < 600) {
			System.out.println("Prêmio de R$: 100");
		}
		obter.close();
	}

}
