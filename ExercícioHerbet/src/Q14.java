import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		try (Scanner obter = new Scanner (System.in)) {
			System.out.println("Infome o número tolta de homens e mulheres matriculados ");
			int nmTotal = obter.nextInt();
			System.out.println("Número de homens matrículados : ");
			int nmHomens = obter.nextInt();
			System.out.println("Número de mulheres : ");
			int nmMulheres = obter.nextInt();
			
			double perH = (nmHomens * 100) / nmTotal;
			double perM = (nmMulheres * 100) / nmTotal;
			
			System.out.println("Porcentagem de homens é de : " + perH);
			System.out.println("Porcentagem de mulheres é de : " + perM);
		}
		
		
		
		
		
	}

}
