import java.util.Scanner;

public class Prova17 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Informe o valor do lado do quadrado : ");
		Integer l = obter.nextInt();
		
		Integer perimetro = (2 * l) + (2 * l); 
		Integer area = l * l;
		Integer formaDiagonal = (l) * 2 + (l)* 2;
		
		Integer diagonal =  (int) Math.sqrt(formaDiagonal);
		
		System.out.println("Perimetro : " + perimetro);
		System.out.println("Área : " + area);
		System.out.println("Diagonal : " + diagonal);
		
		 
		obter.close();
		
		

	}

}
