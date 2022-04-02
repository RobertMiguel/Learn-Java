import java.util.Scanner;

public class Prova3 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("1° número inteiro : ");
		Integer nm01 = obter.nextInt();
		System.out.println("2° número inteiro : ");
		Integer nm02 = obter.nextInt();
		
		Integer produto = (nm01 * nm02);
		
		System.out.println("O Produto de " + nm01 + " * " + nm02 + " é : " + produto);  
		
		obter.close();

	}

}
