import java.util.Scanner;

public class Quest?o04 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		Double nm01, nm02, nm03;
		
		System.out.println("Digite o n?mero 1?:");
		nm01 = obter.nextDouble();
		System.out.println("Digite o n?mero 2:");
		nm02 = obter.nextDouble();
		System.out.println("Digite o n?mero 03:");
		nm03 = obter.nextDouble();
		
		if(nm01 > nm02 && nm01 > nm03) {
			System.out.println("Entre os n?meros o maior ? : " + nm01);
		}
		else if (nm02 > nm01 && nm02 > nm03) {
			System.out.println("Entre os n?meros o maior ? : " + nm02);
		}
		else if(nm03 > nm01 && nm03 > nm02) {
			System.out.println("Entre os n?meros o maior ? : " + nm03);
		}
		obter.close();
	}

}
