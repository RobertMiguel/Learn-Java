import java.util.Scanner;

public class Questão20 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite a idade:");
		Integer idade = obter.nextInt();
		
		Integer idade5_7, idade8_10, idade11_15, idade16_30, idade30;
		
		String infantil = "Infantil";
		String juvenil = "Juvenil";
		String adolescente = "Adolescente";
		String adulto = "Adulto";
		String senior = "Sênior";
		
		if(idade < 5) {
			System.out.println("Idade inferior");
		}
		if((idade >= 5)&&(idade <=7)) {
			System.out.println(infantil);
		}
		if((idade >=8)&&(idade <=10)) {
			System.out.println(juvenil);
		}
		if((idade >=11)&&(idade <=15)) {
			System.out.println(adolescente);
		}
		if((idade >= 16)&&(idade <= 30)) {
			System.out.println(adulto);
		}
		if(idade > 30) {
			System.out.println(senior);
		}
		obter.close();
	}

}
