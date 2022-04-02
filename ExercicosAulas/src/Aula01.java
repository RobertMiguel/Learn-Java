import java.util.Scanner;

public class Aula01 {
	
	public static void main (String[]args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor : ");
		Integer nm01 = obter.nextInt();
		System.out.println("Digite o segundo valor : ");
		Integer nm02 = obter.nextInt();
		System.out.println("Digite o terceiro valor :");
		Integer nm03 = obter.nextInt();
		
		int soma = nm01+nm02+nm03;
		
		System.out.println("SOMA : " + soma);
		
		obter.close();
		
	}
	
}
