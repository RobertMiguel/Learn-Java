import java.util.Scanner;

public class Prova9 {

	public static void main(String[] args) {
			
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o  valor da hora aula : ");
		Double vlHr = obter.nextDouble();
		System.out.println("Digite o número de aulas dadas no mês : ");
		Double vlAulaMes = obter.nextDouble();
		System.out.println("Digite o percentual de desconto do INSS : ");
		Double percentINSS = obter.nextDouble();
		  
		Double vlSalaBruto = vlHr * vlAulaMes; 

		Double vlSalaBruto02 =  vlSalaBruto + vlSalaBruto;

		Double vlDescon = vlSalaBruto02 * percentINSS;

		Double vlLquido = vlSalaBruto02 - vlDescon;
		
		System.out.println("Salário liquido de um professor é de : " + vlLquido);
		
		obter.close();
	}

}
