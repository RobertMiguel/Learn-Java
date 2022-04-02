import java.util.Scanner;

public class Prova15 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Número : ");
		Integer nm = obter.nextInt();
		System.out.println("Expoente : ");
		Integer exp = obter.nextInt();
		
		Integer vl = (nm) * exp;
		
		System.out.println("Valo é : " + vl);
		
		obter.close();

	}

}
