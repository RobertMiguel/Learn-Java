import java.util.Scanner;

public class Prova2 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n?mero inteiro : ");
		int nm01 = obter.nextInt();
		System.out.println("Digite o segundo n?mero inteiro : ");
		int nm02 = obter.nextInt();
		System.out.println("Os dois n?meros inteiros digitas foram : " + nm01 + " e " + nm02);
		
		obter.close();
	}

}
