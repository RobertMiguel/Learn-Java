import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		System.out.println("N?mero de refei??es para adultos : ");
		int nmAdult = obter.nextInt();
		System.out.println("N?mero de refei??es para crian?as : ");
		int nmCrianc = obter.nextInt();
		
		Double vlAdulto = 20.00;
		Double vlCrianca = 12.00;
		
		Double quantTicket1 = nmAdult / vlAdulto;
		Double quantTicket2 = nmCrianc / vlCrianca;
		
		Double vlTicketAdul = nmAdult * vlAdulto;
		Double vlTicketCria = nmCrianc * vlCrianca;
		
		Double vlTotal = vlTicketAdul + vlTicketCria;
		
		System.out.println("O cliente deve pagar R$ " + vlTicketAdul + " pelos os " + quantTicket1 + " tickets de refei??o para adultos e R$  " + vlTicketCria + " pelos " + quantTicket2 + " de refei??o para crian?as, totalizando R$ " +  vlTotal );
		
		obter.close();
	}

}
