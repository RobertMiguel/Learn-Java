import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		
		try (Scanner obter = new Scanner (System.in)) {
			System.out.println("Solicite o n?mero de ovos vendidos : ");
			Double ovos = obter.nextDouble();
			
			Double ovoDuzi = Math.floor(ovos / 12);
			Double ovoDuzi2 = Math.floor(ovos % 12);
			System.out.println("O cliente comprou " + ovos + " ovos , o que equivale a " + ovoDuzi + " d?zias e " + ovoDuzi2 + " ovos " );
		}
		
		
		
	}

}
