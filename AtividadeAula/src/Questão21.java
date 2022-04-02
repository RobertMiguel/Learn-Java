import java.util.Scanner;

public class Questão21 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		Double hT, sM, hX;
		
		System.out.println("Digite o valor de horas trabalhadas:");
		hT = obter.nextDouble();
		System.out.println("Valor do salário mínimo:");
		sM = obter.nextDouble();
		System.out.println("Número de horas extras trabalhadas:");
		hX = obter.nextDouble();
		
		Double vlhT = hT / 8;
		Double vlhX = sM / 4;
		Double slBruto = hT * vlhT;
		Double quantHorasX = hX * vlhX;
		Double slTotal = slBruto + quantHorasX;
		
		System.out.println("Valor da hora trabalhada : R$ " + vlhT);
		System.out.println("Valor da hora extra: R$ " + vlhX);
		System.out.println("Salário bruto vale: R$ " + slBruto);
		System.out.println("Valor das horas extras: R$ " + quantHorasX);
		System.out.println("Salário ao receber: R$ " + slTotal);
		
		obter.close();
	}

}
