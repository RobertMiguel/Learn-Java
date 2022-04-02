import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		int idade;
		int g15 = 0,g16_30 = 0;
		int g31_45 = 0;
		int g46_60 = 0;
		int g60 = 0;
		
		for(int i = 1; i <=8;i++) {
			System.out.println("Qual a idade da pessoa:");
			idade = obter.nextInt();
			if(idade <=15) {
				g15++;
			}
			if((idade >=16)&&(idade<30)) {
				g16_30++;
			}
			if((idade >=31)&&(idade <=45)) {
				g31_45++;
			}
			if((idade >=46)&&(idade<=60)) {
				g46_60++;
			}
			if(idade >=60) {
				g60++;
			}
		}
		System.out.println("Faixa etária de 15 anos: "+g15);
		System.out.println("Faixa etária de 16 a 30 anos: "+g16_30);
		System.out.println("Faixa etária de 31 a 45 anos: "+g31_45);
		System.out.println("Faixa etária de 46 a 60 anos: "+g46_60);
		System.out.println("Faixa etária de acima de 60 anos: "+g60);
		
		
	}
}
