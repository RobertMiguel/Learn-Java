import java.util.Scanner;

public class Testeifelse {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o pre?o do livro de Linux: R$");
		Double livroL = obter.nextDouble();
		System.out.println("Digite o pre?o do livro de Java: R$");
		Double livroJ = obter.nextDouble();
		
		Double total = livroL+livroJ;
		
		System.out.println("Pre?o tolta ?: R$ " + total);
		
		if(livroL == 10) {
			System.out.println("O livro de Linux est? quase de gra?a!\n");
		}
		if(total <= 120) {
			System.out.println("O pre?o est? bom!");
		}
		else {
			System.out.println("Os livros est? caros!");
		}
		if(livroL < livroJ) {
			System.out.println("Livro de linux est? mais barato!");
		}
		else if (livroJ < livroL) {
			System.out.println("Livro de java estpa mais barato!");
		}
		else {
			System.out.println("Os livros tem o mesmo pre?o");
		}
		
		obter.close();
	}

}
