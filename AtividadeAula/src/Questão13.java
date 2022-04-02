import java.util.Scanner;

public class Questão13 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.print("Digite um número:");
		Integer mult = obter.nextInt();
		
		Integer vl0 = mult * 0;
		Integer vl1 = mult * 1;
		Integer vl2 = mult * 2;
		Integer vl3 = mult * 3;
		Integer vl4 = mult * 4;
		Integer vl5 = mult * 5;
		Integer vl6 = mult * 6;
		Integer vl7 = mult * 7;
		Integer vl8 = mult * 8;
		Integer vl9 = mult * 9;
		Integer vl010 = mult * 10;
		
		System.out.println(mult + " * 0 = " + vl0);
		System.out.println(mult + " * 1 = " + vl1);
		System.out.println(mult + " * 2 = " + vl2);
		System.out.println(mult + " * 3 = " + vl3);
		System.out.println(mult + " * 4 = " + vl4);
		System.out.println(mult + " * 5 = " + vl5);
		System.out.println(mult + " * 6 = " + vl6);
		System.out.println(mult + " * 7 = " + vl7);
		System.out.println(mult + " * 8 = " + vl8);
		System.out.println(mult + " * 9 = " + vl9);
		System.out.println(mult + " * 10 = " + vl010);
		
		obter.close();
		
	}

}
