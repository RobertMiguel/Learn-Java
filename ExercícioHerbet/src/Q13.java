import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		try (Scanner obter = new Scanner (System.in)) {
			System.out.println("Quantidade de biscoitos consumido : ");
			int bisc = obter.nextInt();
			int cal = bisc * 300;
			System.out.println("Você consumiu : " + cal + " Kcal");
		}

	}

}
