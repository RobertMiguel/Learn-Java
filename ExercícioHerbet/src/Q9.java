import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		try (Scanner obter = new Scanner (System.in)) {
			System.out.println("N?mero de milhas percorrida :");
			Double milha = obter.nextDouble();
			System.out.println("N?mero de gal?es consumidos :");
			Double gal?o = obter.nextDouble();
			Double mpg = milha / gal?o; 
			Double vlMilha = milha*1.60934;
			
			System.out.println("Consumo de milh?os por gal?o (MPG) :" + mpg);
			System.out.println("Valor em Km: " + vlMilha);
		}
		
		
		

	}
}
