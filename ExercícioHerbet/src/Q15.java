import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		try (Scanner obter = new Scanner (System.in)) {
			System.out.println("Quantos cookies deseja fazer ? ");
			
			int cook = obter.nextInt();
			int qtcook = cook * 48;
			int resultcook = qtcook / 48;
			
			System.out.println("Vão ser feitos : " + resultcook + " cookies");
			double xirsugar = 1.5;
			double xirteiga = 1;
			double xirfari = 2.75;
			
			double resultxirsugar = cook * xirsugar;
			double resultxirteiga = cook * xirteiga;
			double resulfari = cook * xirfari ;
			System.out.println("==========================================");
			System.out.println("Vai ser preciso : " + resultxirsugar + " xírcaras de açucar ");
			System.out.println("Vai ser preciso : " + resultxirteiga + " xírcaras de manteiga");
			System.out.println("Vai ser preciso : " + resulfari + " xírcaras de farinha");
		}
		
		
	}

}
