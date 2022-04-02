import java.util.Scanner;

public class Questão09 {
	public static final double SALDO_MEDIO_30 = 0.30;
	public static final double SALDO_MEDIO_25 = 0.25;
	public static final double SALDO_MEDIO_20 = 0.20;
	public static final double SALDO_MEDIO_10 = 0.10;
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.print("Digite o saldo médio de um cliente R$:");
		Double saldoMedia = obter.nextDouble();
		
		Double Percentual30, Percentual25, Percentual20, Percentual10;
		Double PercentAtual30, PercentAtual25, PercentAtual20, PercentAtual10;
		
		if(saldoMedia >= 400) {
			Percentual30 = saldoMedia-(saldoMedia*SALDO_MEDIO_30);
			PercentAtual30 = Percentual30 + saldoMedia;
			System.out.println("Foi de 30%");
			System.out.println("Valor é de R$: " + Percentual30);
			System.out.println("Valor atual do saldo médio é R$: " + PercentAtual30);
		}
		else if(saldoMedia <= 400 && saldoMedia > 300) {
			Percentual25 = saldoMedia-(saldoMedia*SALDO_MEDIO_25);
			PercentAtual25 = saldoMedia + Percentual25;
			System.out.println("Foi de 25%");
			System.out.println("Valor é de R$: " + Percentual25);
			System.out.println("Valor atual do saldo médio é R$: " + PercentAtual25);
		}
		else if(saldoMedia <= 300 && saldoMedia > 200) {
			Percentual20 = saldoMedia-(saldoMedia*SALDO_MEDIO_20);
			PercentAtual20 = saldoMedia + Percentual20;
			System.out.println("Foi de 20%");
			System.out.println("Valor é de R$: " + Percentual20);
			System.out.println("Valor atual do saldo médio é R$: " + PercentAtual20);
		}
		else if(saldoMedia <= 200) {
			Percentual10 = saldoMedia-(saldoMedia*SALDO_MEDIO_10);
			PercentAtual10 = saldoMedia + Percentual10;
			System.out.println("Foi de 10%");
			System.out.println("Valor é de R$: " + Percentual10);
			System.out.println("Valor atual do saldo médio é R$: " + PercentAtual10);
		}
		obter.close();
	}

}
