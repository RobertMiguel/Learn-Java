import java.util.Scanner;

public class Questão11 {
	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o custo de fábrica do carro R$: ");
		Double custoCar = obter.nextDouble();
		
		Double distribuidor5 = 0.05;
		Double distribuidor10 = 0.10;
		Double distribuidor15 = 0.15;
		
		String imposto5 = "Isento";
		Double imposto15 = 0.15;
		Double imposto20 = 0.20;
		
		Double dist5, dist10, dist15;
		Double impost15,impost20;
		
		if(custoCar <= 12000) {
			dist5 = custoCar-(custoCar * distribuidor5);
			System.out.println("Valor da distribuidora é de R$: " + dist5);
			System.out.println("Valor do imposto é de R$ " + imposto5);
			System.out.println("5 && Isento");
		}
		else if(custoCar >= 12000 && custoCar < 25000) {
			dist10 = custoCar-(custoCar * distribuidor10);
			impost15 = custoCar-(custoCar * imposto15);
			System.out.println("Valor da distribuidora é de R$: " + dist10);
			System.out.println("Valor do imposto é de R$: " + impost15);
			System.out.println("10 && 15");
		}
		else if(custoCar >=  25000) {
			dist15 = custoCar-(custoCar * distribuidor15);
			impost20 = custoCar-(custoCar * imposto15);
			System.out.println("Valor da distribuidora é de R$: " + dist15);
			System.out.println("Valor do imposto é de R$: " + impost20);
			System.out.println("15 && 20");
			
		}
		obter.close();
	}
}
