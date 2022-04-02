import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		
		try (Scanner obter = new Scanner (System.in)) {
			System.out.println("Digite os minutos (só o número) :");
			int min = obter.nextInt();
			
			double min_houras = min / 60 ;
			double min_dias = min / 1440;
			
			System.out.println(min + " minutos equivalem a " + min_houras + " horas e é igual a " + min_dias + " dias " );
		}
		

	}

}
