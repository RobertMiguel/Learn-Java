import java.util.Scanner;

public class Quest?o22 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o total de lados:");
		Integer tlLados = obter.nextInt();
		
		Double nD = (double) (tlLados * (tlLados - 3) / 2);
		
		System.out.println("N?mero de diagonais do pol?gono: " + nD);
		
		obter.close();

	}

}
