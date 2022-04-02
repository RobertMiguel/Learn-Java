import java.util.Scanner;

public class Q23 {
	public static void main (String[]args) {
	
	
	try (Scanner obter = new Scanner (System.in)) {
		System.out.println("Informe o nome do Partido 1° : ");
		String part1 = obter.next();
		System.out.println("Informe o nome do Partido 2° : ");
		String part2 = obter.next();
		System.out.println("Informe o nome do Partido 3° : ");
		String part3 = obter.next();
		
		System.out.println("Quantidade de votos do partido " + part1 + " recebeu : ");
		Double votosPar1 = obter.nextDouble();
		System.out.println("Quantidade de votos do partido " + part2 + " recebeu : ");
		Double votosPar2 = obter.nextDouble();
		System.out.println("Quantidade de votos do partido " + part3 + " recebeu : ");
		Double votosPar3 = obter.nextDouble();
		
		Double ttlVotos = votosPar1+votosPar2+votosPar3;
		
		Double porcent1 = (votosPar1 * 100) / ttlVotos;
		Double porcent2 = (votosPar2 * 100) / ttlVotos;
		Double porcent3 = (votosPar3 * 100) / ttlVotos;
		
		System.out.println("Percentual de votos do partido " + part1 + " é de " + porcent1 + "%");
		System.out.println("Percentual de votos do partido " + part2 + " é de " + porcent2 + "%");
		System.out.println("Percentual de votos do partido " + part3 + " é de " + porcent3 + "%");
	}
	

	}
}

