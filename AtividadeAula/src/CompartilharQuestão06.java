import java.util.Scanner;

public class CompartilharQuest?o06 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o valor fixo do sal?rio:");
		Double salario = obter.nextDouble();
		System.out.println("Digite o valor das vendas:");
		Double vendas = obter.nextDouble();
		
		Double comissao = 0.04;
		Double valorDaComissao = vendas-(vendas*comissao);
		Double ValorTotal = salario+valorDaComissao;
		
		System.out.println("Sal?rio atual ?:" + ValorTotal);
		System.out.println("Valor da comiss?o ?: R$ " + valorDaComissao);
		
		obter.close();
	}

}
