import java.util.Scanner;

public class Questão17 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Valor do Raio:");
		Double raio = obter.nextDouble();
		
		Double Comprimento_esfera = 2 * 3.14 * raio;
		Double Area_Esfera = 3.14 * Math.pow(raio, 2);
		Double volume_esfera = 0.75 * 3.14 * Math.pow(raio, 3);
		
		System.out.println("Comprimento da esfera: " + Comprimento_esfera);
		System.out.println("Área da esfera: " + Area_Esfera);
		System.out.println("Volume da esfera: " + volume_esfera);
		
		obter.close();
		
	}

}
