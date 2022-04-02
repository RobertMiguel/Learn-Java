import java.util.Scanner;

public class ifElse {
	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Qual seu nome:");
		String nome = obter.nextLine();
		System.out.println("Qual sua idade:");
		Integer idade = obter.nextInt();
		
		if(idade <= 17) {
			System.out.println("Menor de idade");
		}
		else if(idade > 18) {
			System.out.println("Teste");
		}
		else {
			System.out.println("Maoridade");
		}
	}
}
