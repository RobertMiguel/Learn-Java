import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		try (Scanner obter = new Scanner (System.in)) {
			System.out.println("Infome o n?mero tolta de homens e mulheres matriculados ");
			int nmTotal = obter.nextInt();
			System.out.println("N?mero de homens matr?culados : ");
			int nmHomens = obter.nextInt();
			System.out.println("N?mero de mulheres : ");
			int nmMulheres = obter.nextInt();
			
			double perH = (nmHomens * 100) / nmTotal;
			double perM = (nmMulheres * 100) / nmTotal;
			
			System.out.println("Porcentagem de homens ? de : " + perH);
			System.out.println("Porcentagem de mulheres ? de : " + perM);
		}
		
		
		
		
		
	}

}
