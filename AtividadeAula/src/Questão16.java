import java.util.Scanner;

public class Questão16 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		Double hipotenusa;
		
		System.out.println("Valor do primero cateto:");
		Double cateto01 = obter.nextDouble();
		System.out.println("Valor do segundo cateto:");
		Double cateto02 = obter.nextDouble();
		
		hipotenusa = Math.sqrt(Math.pow(cateto01, 2)+Math.pow(cateto02, 2));
		System.out.println("Hipotenusa é: " + hipotenusa);
		
		if(hipotenusa < 0){
			 hipotenusa = hipotenusa * (-1);
		}
		
		obter.close();

	}

}
