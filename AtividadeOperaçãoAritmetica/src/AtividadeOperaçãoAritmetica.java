import java.util.Scanner;

public class AtividadeOpera??oAritmetica {

	

	public static void main(String[] args) {
		
		Scanner fds = new Scanner (System.in);
		System.out.println("Digite o primeiro n?mero :");
		Double nmDigitado01 = fds.nextDouble();
		
		System.out.println("Digite o segundo n?mero :");
		Double nmDigitado02 = fds.nextDouble();
		
		
		
		System.out.println("Digite (1) para adi??o, (2) para subtra??o, (3) para multiplica??o e (4) para divis?o");
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
		
		System.out.println("O resultado ? : " + result);
		
		fds.close();
	}
}
