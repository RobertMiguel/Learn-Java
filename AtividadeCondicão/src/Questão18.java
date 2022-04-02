import java.util.Scanner;

public class Questão18 {
	 
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digita a idade:");
		Integer idade = obter.nextInt();
		
		if(idade < 18) {
			System.out.println("Menor de idade");
		}
		else {
			System.out.println("Maioridade");
		}
		obter.close();
	}
}
