import java.util.Scanner;

public class Quest?o08 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o peso em Quilos:");
		Double pesoQuilos = obter.nextDouble();
		
		Double quilosParaGramas = pesoQuilos*1000;
		
		System.out.println("Peso em gramas ?: " + quilosParaGramas);
		
		obter.close();

	}

}
