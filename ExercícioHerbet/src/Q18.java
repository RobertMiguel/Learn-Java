import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		
		try (Scanner obter = new Scanner (System.in)) {
			System.out.println("Distância em polegadas : ");
			Double disPo = obter.nextDouble();
			
			Double disPe = disPo / 12;
			Double disCm = disPo / 2.54;
			
			System.out.println(disPo + " polegadas equivalem a " + disPe + " Pés ");
			System.out.println(disPo + " polegadas equivalem a " + disCm + " Cm ");
		}
		
		
		
	}

}
