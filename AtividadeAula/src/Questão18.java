import java.util.Scanner;

public class Quest?o18 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Graus Celsius:");
		Double temperaturaCelsius = obter.nextDouble();
		
		Double fahrenheit = 180*(temperaturaCelsius+32)/100;
		
		System.out.println("Temperatura em Fahrenheit ?: " + fahrenheit);
		
		obter.close();

	}

}
