import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		try (Scanner refei = new Scanner (System.in)) {
			System.out.println("Valor da refeição :");
			Double vlRef = refei.nextDouble();
			Double vlGor = vlRef*0.15;
			Double impostRefei = vlRef*0.07;
			Double vlTotalRefei = vlRef+vlGor+impostRefei;
			System.out.println("Valor total R$ :" + vlTotalRefei);
			System.out.println("Valo do imposto foi de R$ :" + impostRefei);
			System.out.println("Valor da gorjeta foi de R$ :" + vlGor);
		}
		

	}

}
