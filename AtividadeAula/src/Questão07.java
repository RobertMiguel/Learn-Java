import java.util.Scanner;

public class Questão07 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Informe seu peso :");
		Double peso = obter.nextDouble();
		
		Double peso15Porcento = peso+(peso*0.15);	//Engordar 15%
		Double peso20Porcento = peso-(peso*0.20);	//Emagrecer 20%
		
		System.out.println("Peso engordado a 15% é: " + peso15Porcento);
		System.out.println("Peso emagrecido a 20% é: " + peso20Porcento);
		
		obter.close();
	}

}
