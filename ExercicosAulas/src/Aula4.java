import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o n?mero : ");
		Integer numero = obter.nextInt();
		
		Integer numeroQuadrado = (int) Math.pow(numero, 2);
		Integer numeroCubo = (int) Math.pow(numero, 3);
		Integer numeroRaiz = (int) Math.sqrt(numero);
		
		System.out.println("N?mero ao quadrado :" + numeroQuadrado);
		System.out.println("N?mero ao cubo : " + numeroCubo );
		System.out.println("Raiz quadrada do n?mero : " + numeroRaiz);
		
		obter.close();
	}

}
