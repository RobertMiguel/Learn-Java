import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o número : ");
		Integer numero = obter.nextInt();
		
		Integer numeroQuadrado = (int) Math.pow(numero, 2);
		Integer numeroCubo = (int) Math.pow(numero, 3);
		Integer numeroRaiz = (int) Math.sqrt(numero);
		
		System.out.println("Número ao quadrado :" + numeroQuadrado);
		System.out.println("Número ao cubo : " + numeroCubo );
		System.out.println("Raiz quadrada do número : " + numeroRaiz);
		
		obter.close();
	}

}
