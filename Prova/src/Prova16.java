import java.util.Scanner;

public class Prova16 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		System.out.println("Digite o valor do Salario Minimo : R$ ");
		double vlSM = obter.nextDouble();
		System.out.println("Digite a quantidade de QuiloWatt:");
		double vlQLWT = obter.nextDouble();
		System.out.println("Digite a porcentagem de desconto : ");
		double vlDescont = obter.nextDouble();
		
		double vlCadaQLWT = (vlSM / 7) / 100;

		double vlSerPagoVALP = vlCadaQLWT * vlQLWT;

		double descont = ( vlSerPagoVALP * vlDescont) / 100; // Coloquei vlDescont, caso fosse outro valor de desconto também

		double vlNovo = vlSerPagoVALP - descont;
		
		System.out.println("O valor em reais de cada quilowatt : " + vlCadaQLWT);
		System.out.println("O valor em reais a ser pago : " + vlSerPagoVALP);
		System.out.println("o novo valor a ser pago por essa residência com um desconto de 10% : " + vlNovo);
		
		obter.close();

	}

}
