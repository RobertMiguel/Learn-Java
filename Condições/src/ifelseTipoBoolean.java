import java.util.Scanner;

public class ifelseTipoBoolean {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		boolean criterioReprovado;
		
		System.out.println("Informe a média :");
		Double media = obter.nextDouble();
		
		if(media >= 6) {
			System.out.println("APROVADO");
		}
		if(media < 6.0 && media >= 4.0) {			
			// && -> and (e)
			// || -> our (ou)
			System.out.println("RECUPERAÇÃO");
		}
		if(criterioReprovado = media >= 0 && media < 4.0) {
			System.out.println("Reprovado");
		}
	}

}
