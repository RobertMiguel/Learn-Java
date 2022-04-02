import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {			
		
		try (Scanner obter = new Scanner(System.in)) {
			System.out.println("Quantidade de ações compradas : ");
			Double açoesBuy = obter.nextDouble();
			System.out.println("Valor de cada ação comprada :");
			Double açõescomprada = obter.nextDouble();
			System.out.println("O valor percentual da comissão na compra : ");
			Double percent = obter.nextDouble();
			System.out.println("O valor de cada ação no momento da venda : ");
			Double vlmomentVenda = obter.nextDouble();
			System.out.println("O valor percentual da comissão na venda : ");
			Double percentcomisvend = obter.nextDouble();
			
			
			Double ttlComissao = açoesBuy * (açõescomprada * percent);
			System.out.println("Total na hora da corretagem é de R$: " + ttlComissao);
			Double vlttlcompra = (açoesBuy * açõescomprada) + ttlComissao;
			System.out.println("Valor total da compra foi de R$: " + vlttlcompra);

			Double ttlVenda = açoesBuy * (vlmomentVenda * percentcomisvend);	
			System.out.println("Total na hora da comissão foi de R$: " + ttlVenda);
			Double vlttlVenda1 = (açoesBuy * vlmomentVenda) + ttlVenda;
			System.out.println("Valor total na hora da venda foi de R$: " + vlttlVenda1);
		}

	
	}
}
