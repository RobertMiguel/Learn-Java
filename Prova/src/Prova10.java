import java.util.Scanner;

public class Prova10 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Informe o valor : ");
		double vl = obter.nextInt();
		System.out.println("Informe a taxa");
		double vlTaxa = obter.nextDouble();
		System.out.println("Informe o tempo : ");
		double vlTempo = obter.nextDouble();
		
		double prestação = vl + (vl*(vlTaxa/ 100)*vlTempo);
		
		System.out.println("Valor de uma prestação em atraso é : " + prestação);
		
		obter.close();

	}

}
