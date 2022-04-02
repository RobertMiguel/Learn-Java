import java.util.Scanner;

public class Questão09 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		System.out.println("Altura do trapézio:");
		Double altura = obter.nextDouble();
		System.out.println("Digite a base menor do trapézio:");
		Double baseMenor = obter.nextDouble();
		System.out.println("Digite a base maior do trapézio:");
		Double baseMaior = obter.nextDouble();
		
		Double area = ((baseMaior+baseMenor)*altura)/2;
		
		System.out.println("A altura do trapézio é: " + area);
		
		obter.close();

	}

}
