import java.util.Scanner;

public class Prova19 {
	static final Double vldescont = 0.09;

	public static void main(String[] args) {
		Scanner obter =  new Scanner (System.in);
		
		System.out.println("Valor do produto : ");
		double vlProduto = obter.nextDouble();		
		double vlProdutoAtual = vlProduto * vldescont;		
		double vltotal = vlProduto - vlProdutoAtual;		
		System.out.println("Valor do produto com desconto : R$ " + vltotal);
		
		obter.close();

	}

}
