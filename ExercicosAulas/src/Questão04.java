import java.util.Scanner;

public class Questão04 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		Double nm01, nm02;
		
		System.out.println("Digite primeiro nota:");
		nm01 = obter.nextDouble();
		System.out.println("Digite a segundo nota:");
		nm02 = obter.nextDouble();
		
		Double mP = (nm01*2)+(nm02*3)/3+2;	
		
		System.out.println("Media é : " + mP);
		
		obter.close();
		
	}

}
