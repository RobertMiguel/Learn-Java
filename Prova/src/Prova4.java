import java.util.Scanner;

public class Prova4 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o 1° valor : ");
		Integer nm01 = obter.nextInt();
		System.out.println("Digite o 2° valor : ");
		Integer nm02 = obter.nextInt();
		System.out.println("Digite o 3° valor : ");
		Integer nm03 = obter.nextInt();
		System.out.println("Digite o 4° valor : ");
		Integer nm04 = obter.nextInt();

		Integer media = (nm01 + nm02 + nm03 + nm04) / 4;
		
		System.out.println("Sua média é : " + media);
		
		obter.close();

	}

}
