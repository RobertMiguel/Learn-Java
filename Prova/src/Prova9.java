import java.util.Scanner;

public class Prova9 {

	public static void main(String[] args) {
			
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o  valor da hora aula : ");
		Double vlHr = obter.nextDouble();
		System.out.println("Digite o n?mero de aulas dadas no m?s : ");
		Double vlAulaMes = obter.nextDouble();
		System.out.println("Digite o percentual de desconto do INSS : ");
		Double percentINSS = obter.nextDouble();
		  
		Double vlSalaBruto = vlHr * vlAulaMes; 

		Double vlSalaBruto02 =  vlSalaBruto + vlSalaBruto;

		Double vlDescon = vlSalaBruto02 * percentINSS;

		Double vlLquido = vlSalaBruto02 - vlDescon;
		
		System.out.println("Sal?rio liquido de um professor ? de : " + vlLquido);
		
		obter.close();
	}

}
