import java.util.Scanner;

public class Quest?o06 {
	public static void main(String[] args) {
		Scanner obter = new Scanner (System.in);
		System.out.println("Digite o 1? n?mero:");
		Integer num01 = obter.nextInt();
		System.out.println("Digite o 2? n?mero:");
		Integer num02 = obter.nextInt();
		
		System.out.println("####################");
		System.out.println("[1]O primeiro n?mero elevado ao segundo n?mero");
		System.out.println("[2]Raiz quadrada de cada um dos n?meros");
		System.out.println("[3]Raiz c?bica de cada um dos n?meros");
		System.out.println("Escolha uma opera??o:");
		Integer oprc = obter.nextInt();
		
		Integer elevado, raizQuadrada01, raizQuadrada02, raizCubica01, raizCubica02;
		
		if(oprc == 1) {
			elevado = (int) Math.pow(num01, num02);
			System.out.println("1? elevado ao 2?: " + elevado);
		}
		if(oprc == 2) {
			raizQuadrada01 = (int) Math.sqrt(num01);
			raizQuadrada02 = (int) Math.sqrt(num02);
			System.out.println("Raiz quadrado do 1?: " + raizQuadrada01 + " do 2?: " + raizQuadrada02);
		}
		if(oprc == 3) {
			raizCubica01 = (int) Math.cbrt(num01);
			raizCubica02 = (int) Math.cbrt(num02);
			System.out.println("Raiz c?bica do 1?: " + raizCubica01 + " do 2?: " + raizCubica02);
		}
		else {
			System.out.println("Opera??o invalida");
		}
		obter.close();
	}
}
