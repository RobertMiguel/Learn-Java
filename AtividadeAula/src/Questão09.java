import java.util.Scanner;

public class Quest?o09 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		System.out.println("Altura do trap?zio:");
		Double altura = obter.nextDouble();
		System.out.println("Digite a base menor do trap?zio:");
		Double baseMenor = obter.nextDouble();
		System.out.println("Digite a base maior do trap?zio:");
		Double baseMaior = obter.nextDouble();
		
		Double area = ((baseMaior+baseMenor)*altura)/2;
		
		System.out.println("A altura do trap?zio ?: " + area);
		
		obter.close();

	}

}
