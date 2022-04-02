import java.util.Scanner;

public class Questão02 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número :");
		Integer nm01 = obter.nextInt();
		System.out.println("Digite o segundo número :");
		Integer nm02 = obter.nextInt();
		System.out.println("Digite o terceiro número :");
		Integer nm03 = obter.nextInt();
		
		Integer multiplicacao = nm01 * nm02 * nm03;
		
		System.out.println("Multiplicação é : " + multiplicacao);
		
		obter.close();
	}

}
