import java.util.Scanner;

public class Prova5 {
	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o número : ");
		Integer nm01 = obter.nextInt();
		
		Integer quadrado = (nm01) * (nm01);
		
		Integer resultado = (int) Math.sqrt(nm01); 
		
		System.out.println("Número : " + nm01);
		System.out.println("Quadrado : " + quadrado);
		System.out.println("Raiz : " + resultado);
		
		obter.close();

	}

}
