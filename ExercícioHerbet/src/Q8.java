import java.util.Scanner;

public class Q8 {
	public static void main (String[]args) {
		try (Scanner obter = new Scanner(System.in)) {
			System.out.println("Valor da compra :");
			
			Double vlCompra = obter.nextDouble();
			Double impEstadual = 0.04*vlCompra;
			Double impMunicipal = 0.02*vlCompra;
			
			System.out.println("Valor da compra R$:" +vlCompra);
			System.out.println("Valor do Imposto Estadual: " + impEstadual);
			System.out.println("Valor do Imposto Municipal : " + impMunicipal);
		}
		
		
		
		
	}
}
