import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		try (Scanner obter = new Scanner(System.in)) {
			System.out.println("Velocidade em que o autom?vel percorreu :");
			Double velo = obter.nextDouble();
			
			System.out.println("Tempo gasto na viajem :");
			Double temp = obter.nextDouble();
			
			Double dist = velo*temp;
			System.out.println("Dist?ncia percorrida ? " + dist+ "Km");
		}

	}

}
