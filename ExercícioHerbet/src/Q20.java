import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		System.out.println("Número de refeições para adultos : ");
		int nmAdult = obter.nextInt();
		System.out.println("Número de refeições para crianças : ");
		int nmCrianc = obter.nextInt();
		
		Double vlAdulto = 20.00;
		Double vlCrianca = 12.00;
		
		Double quantTicket1 = nmAdult / vlAdulto;
		Double quantTicket2 = nmCrianc / vlCrianca;
		
		Double vlTicketAdul = nmAdult * vlAdulto;
		Double vlTicketCria = nmCrianc * vlCrianca;
		
		Double vlTotal = vlTicketAdul + vlTicketCria;
		
		System.out.println("O cliente deve pagar R$ " + vlTicketAdul + " pelos os " + quantTicket1 + " tickets de refeição para adultos e R$  " + vlTicketCria + " pelos " + quantTicket2 + " de refeição para crianças, totalizando R$ " +  vlTotal );
		
		obter.close();
	}

}
