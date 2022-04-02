import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		try (Scanner obter = new Scanner (System.in)) {
			System.out.println("Digete : número de quartos de galão necessários : ");
			double nmGal = obter.nextDouble();
			
			double umGal =  0.25;
			double quantGal = nmGal * umGal;
			System.out.println( "A quantidade vai ser de : " + quantGal + " galões ");
		}
		
	}

}
