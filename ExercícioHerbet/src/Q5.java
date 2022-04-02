import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		
		try (Scanner obter = new Scanner(System.in)) {
			
			System.out.println("Informe o valor em metros quadrados :");
			Double vlMetroQ = obter.nextDouble();
			
			Double vlAcre = vlMetroQ/4046.86;
			Double vlPesQ = vlAcre*43560;
			Double vlHec = vlAcre*0.404686;
			
			System.out.println("Valor em Pés quadrados : " + vlPesQ );
			System.out.println("Valor em Acre :" + vlAcre );
			System.out.println("Valor em hectares : " + vlHec );
		}
}
}