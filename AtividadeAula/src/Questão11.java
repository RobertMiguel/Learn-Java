import java.util.Scanner;

public class Questão11 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite a diagonal maior do losango:");
		Double dB = obter.nextDouble();
		System.out.println("Digite a diagonal menor do losango:");
		Double db = obter.nextDouble();
		
		Double area = (dB*db)/2;
		
		System.out.println("Área do losango é: " + area);
		
		obter.close();
	}

}
