import java.util.Scanner;

public class Quest?o03 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		Double nm01, nm02;
		
		System.out.println("Digite o n?mero:");
		nm01 = obter.nextDouble();
		System.out.println("Digite o n?mero:");
		nm02 = obter.nextDouble();
		
		if(nm01 < nm02) {
			System.out.println("Entre os n?meros " + nm01 + " , " + nm02 + " o menor ?: " + nm01 );
		}
		else if(nm02 < nm01) {
			System.out.println("Entre os n?meros " + nm01 + " , " + nm02 + " o menor ?: " + nm02);
		}
		else {
			System.out.println("Eles s?o iguais");
		}
		
		obter.close();
	}

}
