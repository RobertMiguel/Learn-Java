import java.util.Scanner;

public class OperadoresLogicos {
	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o número:");
		Integer num = obter.nextInt();
		
		if(num % 2 == 0 && num < 20) {
			System.out.println("PAR");
			System.out.println("OK");
		}
		else if(num % 2 != 0) {
			System.out.println("IMPAR");
		}
		else if(num % 2 ==0 || num < 20) {
			System.out.println("Ok");
		}
	}
}
