import java.util.Scanner;

public class Quest?o21 {
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o pre?o:");
		Double preco = obter.nextDouble();
		System.out.println("Informe o c?digo do produto:");
		Integer cod = obter.nextInt();
		
		String procSul = "Proced?ncia sul";
		String procNort = "Proced?ncia norte";
		String procLest = "Proced?ncia leste";
		String procOest = "Proced?ncia oeste";
		String procNordest01 = "Proced?ncia nordeste";
		String procSudest = "Prced?ncia sudeste";
		String procCO = "Proced?ncia centro-oeste";
		String procNordest02 = "Proced?ncia nordeste";
		
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
			System.out.println("C?gido digitado est? errado");
		}
		obter.close();
	}
}
