import java.util.Scanner;

public class Quest?o23 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Valor do primeiro ?ngulo:");
		Double pAngulo = obter.nextDouble();
		System.out.println("Valor do segundo ?ngulo:");
		Double sAngulo = obter.nextDouble();
		
		Double tAngulo = 180-(pAngulo + sAngulo);
		
		System.out.println("Valor do terceiro ?ngulo ?: " + tAngulo);
		
		
		obter.close();
	}

}
