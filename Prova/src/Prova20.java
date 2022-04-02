import java.util.Scanner;

public class Prova20 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Informe o tempo gasto na viagem :");
		Integer tempGasto = obter.nextInt();
		System.out.println("Informe a velocidade média :");
		Integer velocidadeM = obter.nextInt();
		
		Integer  dist = tempGasto * velocidadeM;
		Integer litrosGasto = (dist / 12);
		
		System.out.println("Velocidade média : " + velocidadeM);
		System.out.println("Tem gasto na viagem : " + litrosGasto);
		System.out.println("A distância percorrida é : " + dist);
		System.out.println("A quantidade de litros gasto é : " + litrosGasto );
		
		obter.close();

	}

}
