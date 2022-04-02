import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		try (Scanner obter = new Scanner(System.in)) {
			System.out.println("Valor total de vendas :");
			double tlVenda = obter.nextDouble();		
			double lcVenda = 0.23 * tlVenda;
			System.out.println("Lucro anual de vendas é :" + lcVenda);
		}
		
	}
}
