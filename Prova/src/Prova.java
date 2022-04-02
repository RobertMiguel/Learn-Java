import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = obter.next();
		System.out.println("Seu nome é " + nome);
		obter.close();
		
	}

}
