import java.util.Scanner;

public class Questão01 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número :");
		Integer nm01 = obter.nextInt();
		System.out.println("Digite o segundo número :");
		Integer nm02 = obter.nextInt();
		
		Integer subtracao = nm01 - nm02;
		
		System.out.println("Resultado é : " + subtracao);
		
		obter.close();

	}

}
