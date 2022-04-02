import java.util.Scanner;

public class Prova14 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Primeiro número inteiro : ");
		Integer nm01 = obter.nextInt();
		System.out.println("Segundo número inteiro : ");
		Integer nm02 = obter.nextInt();
		
		double dividendo = nm01;
		double divisor = nm02;
		double quociente = (nm01 / nm02);
		double resto = (nm01 % nm02);
		
		System.out.println("Dividendo : " + dividendo);
		System.out.println("Divisor : " + divisor);
		System.out.println("Quociente : " + quociente);
		System.out.println("Resto : " + resto);
		
		obter.close();
		

	}

}
