import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		try (Scanner obter = new Scanner (System.in)) {
			System.out.println("Informe a temperatura em Celsius : ");
			Double tempCel = obter.nextDouble();
			Double farirraiti = (tempCel * 9/5) + 32;
			
			System.out.println("Valor em Fahrenheit : " + farirraiti+ "ºF");
		}
		
		
		
		
	}
}
