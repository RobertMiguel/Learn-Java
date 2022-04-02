import java.util.Scanner;

public class Questão03 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número :");
		Double nm01 = obter.nextDouble();
		System.out.println("Digite o segundo número :");
		Double nm02 = obter.nextDouble();
		
		Double divisao = nm01 / nm02;
		System.out.println("Valor da divisão é: " + divisao);
		if(nm02 <= 0) {
			System.out.println("Não a divisão possível pois o primeiro número foi : " +nm02);	
		}
		
		
		obter.close();
	}

}
