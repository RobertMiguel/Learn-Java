import java.util.Scanner;

public class Quest?o02 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n?mero :");
		Integer nm01 = obter.nextInt();
		System.out.println("Digite o segundo n?mero :");
		Integer nm02 = obter.nextInt();
		System.out.println("Digite o terceiro n?mero :");
		Integer nm03 = obter.nextInt();
		
		Integer multiplicacao = nm01 * nm02 * nm03;
		
		System.out.println("Multiplica??o ? : " + multiplicacao);
		
		obter.close();
	}

}
