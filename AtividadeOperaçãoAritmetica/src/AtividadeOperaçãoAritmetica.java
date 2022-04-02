import java.util.Scanner;

public class AtividadeOperaçãoAritmetica {

	

	public static void main(String[] args) {
		
		Scanner fds = new Scanner (System.in);
		System.out.println("Digite o primeiro número :");
		Double nmDigitado01 = fds.nextDouble();
		
		System.out.println("Digite o segundo número :");
		Double nmDigitado02 = fds.nextDouble();
		
		
		
		System.out.println("Digite (1) para adição, (2) para subtração, (3) para multiplicação e (4) para divisão");
		Integer nmDaOperacao = fds.nextInt();
		
		Double result = null;
		
		if (nmDaOperacao.equals(1)){
			result = nmDigitado01 + nmDigitado02;
		}
	
		if (nmDaOperacao.equals(2)){
			result = nmDigitado01 - nmDigitado02;
		}
		if (nmDaOperacao.equals(3)){
			result = nmDigitado01 * nmDigitado02;
		}
		if (nmDaOperacao.equals(4)){
			result = nmDigitado01 / nmDigitado02;
		}
		
		System.out.println("O resultado é : " + result);
		
		fds.close();
	}
}
