import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        
        try (Scanner obter = new Scanner (System.in)) {
			System.out.println("digite uma distancia em milhas , para a conversão :");
			double mddMilha = obter.nextDouble();
			
			double milha_Polegada = 63360;
			double milha_Pe = 5280;
			double milha_Jarda = 1760;
			
			double mddMilha_Polegada = mddMilha * milha_Polegada;
			double mddMilha_Pe = mddMilha * milha_Pe;
			double mddMilha_Jarda = mddMilha * milha_Jarda;
			
			System.out.println("Valor em polegadas é de : " + mddMilha_Polegada);
			System.out.println("Valor em Pés é de : " + mddMilha_Pe);
			System.out.println("Valor em Jardas é de : " + mddMilha_Jarda);
		}
        
		
     }
}
