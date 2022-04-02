import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		int num = obter.nextInt();
		int i;
		for(i = 1; i <=10;++i) {
			System.out.println(num + "x" + i + " = " +num*i);
		}
	}
}
