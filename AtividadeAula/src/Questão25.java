import java.util.Scanner;

public class Questão25 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite a hora:");
		Double hora = obter.nextDouble();
		System.out.println("Digite os minutos:");
		Double minutos = obter.nextDouble();
		
		Double hora_Minutos = hora * 60;
		Double totalMinutos = minutos + hora_Minutos;
		Double minutos_Segundos = totalMinutos * 60;
		
		System.out.println("Conversão, hora para minutos: " + hora_Minutos);
		System.out.println("Total de minutos: " + totalMinutos);
		System.out.println("Conversão, total de minutos para segundos: " + minutos_Segundos);
		
		obter.close();

	}

}
