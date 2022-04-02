import java.util.Scanner;

public class ValorDaConta {

	public static void main (String[]args) {
	Scanner obter = new Scanner (System.in);
	
	Double total = 0.0;
	System.out.println("Valor da conta água :");
	total+= obter.nextDouble();
	System.out.println("Valor da conta de luz :");
	total += obter.nextDouble();
	System.out.println("Valor da conta de telefone");
	total += obter.nextDouble();
	System.out.println("Fatura do cartao");
	total += obter.nextDouble();
	
	System.out.print("Total de gastos é de R$: " + total);
	
	obter.close();
	
	
	
	
	}
}
