import java.util.Scanner;

public class Quest?o03 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n?mero :");
		Double nm01 = obter.nextDouble();
		System.out.println("Digite o segundo n?mero :");
		Double nm02 = obter.nextDouble();
		
		Double divisao = nm01 / nm02;
		System.out.println("Valor da divis?o ?: " + divisao);
		if(nm02 <= 0) {
			System.out.println("N?o a divis?o poss?vel pois o primeiro n?mero foi : " +nm02);	
		}
		
		
		obter.close();
	}

}
