import java.util.Scanner;

public class Prova12 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o n?mero inteiro : ");
		Integer nmInt = obter.nextInt();
		System.out.println("O n?mero foi : " + nmInt);
		
		obter.close();
		
	}
	}