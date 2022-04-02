import java.util.Scanner;

public class Testeifelse {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o preço do livro de Linux: R$");
		Double livroL = obter.nextDouble();
		System.out.println("Digite o preço do livro de Java: R$");
		Double livroJ = obter.nextDouble();
		
		Double total = livroL+livroJ;
		
		System.out.println("Preço tolta é: R$ " + total);
		
		if(livroL == 10) {
			System.out.println("O livro de Linux está quase de graça!\n");
		}
		if(total <= 120) {
			System.out.println("O preço está bom!");
		}
		else {
			System.out.println("Os livros está caros!");
		}
		if(livroL < livroJ) {
			System.out.println("Livro de linux está mais barato!");
		}
		else if (livroJ < livroL) {
			System.out.println("Livro de java estpa mais barato!");
		}
		else {
			System.out.println("Os livros tem o mesmo preço");
		}
		
		obter.close();
	}

}
