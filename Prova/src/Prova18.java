import java.util.Scanner;

public class Prova18 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Seu nome : ");
		String nome = obter.next();
		System.out.println("Sua idade : ");
		String idade = obter.next();
		
		System.out.println("Meu nome é " + nome +  " e a minha idade é: " + idade + "." );
		
		obter.close();
		

	}

}
