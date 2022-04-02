import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		int qnt_pessoas = 5;
		int idade, peso, altura;
		double mAltura = 0;
		int idade50 = 0;
		int idade10_20 = 0;
		int pesoTotal = 0;
		
		for(int i = 0; i < qnt_pessoas;i++) {
			System.out.println("Digite a idade :");
			idade = obter.nextInt();
			System.out.println("Digite a altura :");
			altura = obter.nextInt();
			System.out.println("Digite a peso : ");
			peso = obter.nextInt();
			
			if(idade >=50) {
				idade50++;
			}
			if((idade>=10)&&(idade<=20)) {
				idade10_20++;
				mAltura+=altura;
			}
			if(peso>=40) {
				pesoTotal+=peso;
			}
			
		}
		System.out.println("Pessoas com mais de 50 anos: " + idade50);
		System.out.println("Média de altura de pessoas entre 10 a 20 anos: " + mAltura/idade10_20);
		System.out.println("Média de pesos: " + pesoTotal/qnt_pessoas);
		
	}
}
