import java.util.Scanner;

public class Quest?o10 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		Double primeiroLado, segundoLado;
		
		System.out.println("1? lado do quadrado:");
		primeiroLado = obter.nextDouble();
		System.out.println("2? lado do quadrado:");
		segundoLado = obter.nextDouble();
		
		Double area = (primeiroLado*segundoLado);
		
		System.out.println("?rea do quadrado ?: " + area);
		
		obter.close();
		

	}

}
