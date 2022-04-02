import java.util.Scanner;

public class Questão17 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digita a senha:");
		Integer senha = obter.nextInt();
		
		if(senha == 4531) {
			System.out.println("Acesso permitido");
		}
		else {
			System.out.println("Acesso negado");
		}
		obter.close();
	}

}
