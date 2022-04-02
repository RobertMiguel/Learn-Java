import java.util.Scanner;

public class Questão21 {
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o preço:");
		Double preco = obter.nextDouble();
		System.out.println("Informe o código do produto:");
		Integer cod = obter.nextInt();
		
		String procSul = "Procedência sul";
		String procNort = "Procedência norte";
		String procLest = "Procedência leste";
		String procOest = "Procedência oeste";
		String procNordest01 = "Procedência nordeste";
		String procSudest = "Prcedência sudeste";
		String procCO = "Procedência centro-oeste";
		String procNordest02 = "Procedência nordeste";
		
		if(cod == 1) {
			System.out.println(procSul);
		}
		else if(cod == 2) {
			System.out.println(procNort);
		}
		else if(cod == 3) {
		System.out.println(procLest);
		}
		else if(cod == 4) {
			System.out.println(procOest);
		}
		else if((cod == 5) || (cod == 6)) {
			System.out.println(procNordest01);
		}
		else if((cod == 7) || (cod == 8) || (cod == 9)) {
			System.out.println(procSudest);
		}
		else if((cod >= 10) && (cod <= 20)) {
			System.out.println(procCO);
		}
		else if((cod >= 21) && (cod <= 30)) {
			
			System.out.println(procNordest02);
		}
		else {
			System.out.println("Cógido digitado está errado");
		}
		obter.close();
	}
}
