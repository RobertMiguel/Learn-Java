import java.util.Scanner;

public class Prova8 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Valor do cateto 1° : ");
		Integer vlCat01 = obter.nextInt();
		System.out.println("Valor do cateto 2° : ");
		Integer vlCat02 = obter.nextInt();
		
		Integer hip = (vlCat01 * vlCat01) + (vlCat02 * vlCat02);
		


		System.out.println("Valor | Hipotenusa : " + Math.sqrt(hip) );
		
		obter.close();
		
		

	}

}
