import java.util.Scanner;

public class Quest?o01 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n?mero :");
		Integer nm01 = obter.nextInt();
		System.out.println("Digite o segundo n?mero :");
		Integer nm02 = obter.nextInt();
		
		Integer subtracao = nm01 - nm02;
		
		System.out.println("Resultado ? : " + subtracao);
		
		obter.close();

	}

}
