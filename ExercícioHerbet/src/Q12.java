import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {			
		
		try (Scanner obter = new Scanner(System.in)) {
			System.out.println("Quantidade de a??es compradas : ");
			Double a?oesBuy = obter.nextDouble();
			System.out.println("Valor de cada a??o comprada :");
			Double a??escomprada = obter.nextDouble();
			System.out.println("O valor percentual da comiss?o na compra : ");
			Double percent = obter.nextDouble();
			System.out.println("O valor de cada a??o no momento da venda : ");
			Double vlmomentVenda = obter.nextDouble();
			System.out.println("O valor percentual da comiss?o na venda : ");
			Double percentcomisvend = obter.nextDouble();
			
			
			Double ttlComissao = a?oesBuy * (a??escomprada * percent);
			System.out.println("Total na hora da corretagem ? de R$: " + ttlComissao);
			Double vlttlcompra = (a?oesBuy * a??escomprada) + ttlComissao;
			System.out.println("Valor total da compra foi de R$: " + vlttlcompra);

			Double ttlVenda = a?oesBuy * (vlmomentVenda * percentcomisvend);	
			System.out.println("Total na hora da comiss?o foi de R$: " + ttlVenda);
			Double vlttlVenda1 = (a?oesBuy * vlmomentVenda) + ttlVenda;
			System.out.println("Valor total na hora da venda foi de R$: " + vlttlVenda1);
		}

	
	}
}
