import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
		
		System.out.println("Digite o número 1:");
		n1 = obter.nextInt();
		System.out.println("Digite o número 2:");
		n2 = obter.nextInt();
		System.out.println("Digite o número 3:");
		n3 = obter.nextInt();
		System.out.println("Digite o número 4:");
		n4 = obter.nextInt();
		System.out.println("Digite o número 5:");
		n5 = obter.nextInt();
		System.out.println("Digite o número 6:");
		n6 = obter.nextInt();
		System.out.println("Digite o número 7:");
		n7 = obter.nextInt();
		System.out.println("Digite o número 8:");
		n8 = obter.nextInt();
		System.out.println("Digite o número 9:");
		n9 = obter.nextInt();
		System.out.println("Digite o número 10:");
		n10 = obter.nextInt();
		
		Integer somaDosPrimos = 0;
		Integer somaDosPares = 0;
		
		if(n1 %2!=0) {
			somaDosPares+=n1;
		}
		if(n1%2 !=0) {
			somaDosPares+=n2;
		}
		if(n3%2 !=0) {
			somaDosPares+=n3;
		}
		if(n4%2 !=0) {
			somaDosPares+=n4;
		}
		if(n5%2 !=0) {
			somaDosPares+=n5;
		}
		if(n6%2 !=0) {
			somaDosPares+=n6;
		}
		if(n7%2 !=0) {
			somaDosPares+=n7;
		}
		if(n8%2 != 0) {
			somaDosPares+=n8;
		}
		if(n9%2 != 0) {
			somaDosPares+=n9;
		}
		if(n10%10 !=0) {
			somaDosPares+=n10;
		}
		for(int i = 2;i <n1;i++) {
			if(n1%i == 0) {
				n1 = 0;
				break;
			}
		}
		for(int i = 2; i <n2;i++) {
			if(n2%i == 0) {
				n2 = 0;
				break;
			}
		}
		for(int i = 2; i <n3;i++) {
			if(n3%i ==0) {
				n3 =0;
				break;
			}
		}
		for(int i = 2; i <n4;i++) {
			if(n4%i ==0) {
				n4 = 0;
				break;
			}
		}
		for(int i = 2; i<n5;i++) {
			if(n5%i == 0) {
				n5 = 0;
				break;
			}
		}
		for(int i = 2; i<n6;i++) {
			if(n6%i == 0) {
				n6 = 0;
				break;
			}
		}
		for(int i = 2; i <n7;i++) {
			if(n7%i ==0) {
				n7 = 0;
				break;
			}
		}
		for(int i = 2;i <n8; i++) {
			if(n8%i ==0) {
				n8 = 0;
				break;
			}
		}
		for(int i = 2; i <n9;i++) {
			if(n9%i == 0) {
				n9 =0;
				break;
			}
		}
		for(int i = 2; i<n10;i++) {
			if(n10%i == 0) {
				n10 = 0;
				break;
			}
		}
		somaDosPrimos = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;

        System.out.println("Soma dos pares: "+somaDosPares);
        System.out.println("Soma dos primos: "+somaDosPrimos);
		
	}
}
