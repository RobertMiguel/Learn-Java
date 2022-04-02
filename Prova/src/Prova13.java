import java.util.Scanner;

public class Prova13 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		System.out.println("Digite o 1° valor : ");
		Integer nm01 = obter.nextInt();
		System.out.println("Digite o 2° valor : ");
		Integer nm02 = obter.nextInt();
		
		Integer soma = (nm01 + nm02);
		
		System.out.println("Soma : " + soma );
		
		obter.close();
	}

}
