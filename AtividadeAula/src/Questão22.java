import java.util.Scanner;

public class Questão22 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o total de lados:");
		Integer tlLados = obter.nextInt();
		
		Double nD = (double) (tlLados * (tlLados - 3) / 2);
		
		System.out.println("Número de diagonais do polígono: " + nD);
		
		obter.close();

	}

}
