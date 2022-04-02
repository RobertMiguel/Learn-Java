import java.util.Scanner;

public class Questão04 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		Double nm01, nm02, nm03;
		
		System.out.println("Digite o número 1°:");
		nm01 = obter.nextDouble();
		System.out.println("Digite o número 2:");
		nm02 = obter.nextDouble();
		System.out.println("Digite o número 03:");
		nm03 = obter.nextDouble();
		
		if(nm01 > nm02 && nm01 > nm03) {
			System.out.println("Entre os números o maior é : " + nm01);
		}
		else if (nm02 > nm01 && nm02 > nm03) {
			System.out.println("Entre os números o maior é : " + nm02);
		}
		else if(nm03 > nm01 && nm03 > nm02) {
			System.out.println("Entre os números o maior é : " + nm03);
		}
		obter.close();
	}

}
