import java.util.Scanner;

public class Quest?o06 {

	public static final double COMISSAO_SOBRE_AS_VENDAS = 0.04;
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		Double vlSalario, vlVendas;
		
		System.out.println("Digite o valor fixo de seu sal?rio: R$ ");
		vlSalario = obter.nextDouble();
		System.out.println("Valor de suas vendas :");
		vlVendas = obter.nextDouble();
		
		Double vlComissaoVendas = vlVendas-(vlVendas*COMISSAO_SOBRE_AS_VENDAS);	
		Double vlSalarioAtual = vlSalario+vlComissaoVendas;
		
		System.out.println("Sal?rio atual ? : R$ " + vlSalarioAtual);
		System.out.println("Valor da comiss?o ?: R$ " + vlComissaoVendas);
		obter.close();
		
	}

}
