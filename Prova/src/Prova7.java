import java.util.Scanner;

public class Prova7 {

	public static void main(String[] args) {
			
			Scanner obter = new Scanner (System.in);
			
			System.out.println("Digite a medida da diagonal 1° : " );
			Integer diag01 = obter.nextInt();
			System.out.println("Digite a medida da diagonal 2° : " );
			Integer diag02 = obter.nextInt();
			
			Integer area = (diag01 * diag02) / 2;
			
			System.out.println("ÁREA : " + area);
			
			obter.close();
			

	}

}
