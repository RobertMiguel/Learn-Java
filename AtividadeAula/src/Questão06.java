import java.util.Scanner;

public class Questão06 {

	public static final double COMISSAO_SOBRE_AS_VENDAS = 0.04;
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		Double vlSalario, vlVendas;
		
		System.out.println("Digite o valor fixo de seu salário: R$ ");
		vlSalario = obter.nextDouble();
		System.out.println("Valor de suas vendas :");
		vlVendas = obter.nextDouble();
		
		Double vlComissaoVendas = vlVendas-(vlVendas*COMISSAO_SOBRE_AS_VENDAS);	
		Double vlSalarioAtual = vlSalario+vlComissaoVendas;
		
		System.out.println("Salário atual é : R$ " + vlSalarioAtual);
		System.out.println("Valor da comissão é: R$ " + vlComissaoVendas);
		obter.close();
		
	}

}
