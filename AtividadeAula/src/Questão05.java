import java.util.Scanner;

public class Quest?o05 {
	public static final double DESCONTO = 0.10;
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Pre?o do produto:");
		Double precoProduto = obter.nextDouble();
		
		double precoDesconto = precoProduto*DESCONTO;
		double precoAtual = precoProduto-precoDesconto;
		
		System.out.print("Valor do produto ?: R$ " + precoAtual);
		
		obter.close();
		
	}

}
