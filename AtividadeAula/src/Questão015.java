import java.util.Scanner;

public class Questão015 {
	public static final double MULTA = 0.02;
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.print("Digite seu salário: R$ ");
		Float salario = obter.nextFloat();
		System.out.print("Digite o valor da primeira conta: R$ ");
		Float conta01 = obter.nextFloat();
		System.out.print("Digite o valor da segunda conta: R$ ");
		Float conta02 = obter.nextFloat();
		
		Double vlConta01 = conta01+(conta01*MULTA);
		Double vlConta02 = conta02+(conta02*MULTA);
		Double vlSalarioFinal = (salario-(vlConta01+vlConta02));
		
		System.out.println("Resto do salário é: R$ " + vlSalarioFinal);
		
		obter.close();
	}

}
