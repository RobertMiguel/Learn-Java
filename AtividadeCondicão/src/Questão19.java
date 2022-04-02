import java.util.Scanner;

public class Questão19 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digita a altura:");
		Double altura = obter.nextDouble();
		System.out.println("Digite o sexo, 1 para masculino e 2 para feminino:");
		Integer sexo = obter.nextInt();
		
		Double homem, mulher;
		
		if(sexo == 1) {
			homem = (72.7 * altura)-58;
			System.out.println("Peso ideal: " + homem + " Kg");
		}
		if(sexo == 2) {
			mulher = (62.1 * altura)-44.7;
			System.out.println("Peso ideal: " + mulher + " Kg");
		}
		
		obter.close();

	}

}
