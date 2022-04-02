import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		try (Scanner obter = new Scanner (System.in)) {
			System.out.println("Número de milhas percorrida :");
			Double milha = obter.nextDouble();
			System.out.println("Número de galões consumidos :");
			Double galão = obter.nextDouble();
			Double mpg = milha / galão; 
			Double vlMilha = milha*1.60934;
			
			System.out.println("Consumo de milhãos por galão (MPG) :" + mpg);
			System.out.println("Valor em Km: " + vlMilha);
		}
		
		
		

	}
}
