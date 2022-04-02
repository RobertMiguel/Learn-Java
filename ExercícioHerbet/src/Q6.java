import java.util.Scanner;
public class Q6 {
	
	public static void main (String[]args) {
		
			try (Scanner scanner = new Scanner (System.in)) {
				System.out.println("Informe o valor do Produto 1 :");
				Double prod1 = scanner.nextDouble();
				
				System.out.println("Informe o valor do Produto 2 :");
				Double prod2 = scanner.nextDouble();
				
				System.out.println("Informe o valor do Produto 3 :");
				Double prod3 = scanner.nextDouble();
				
				System.out.println("Informe o valor do Produto 4 :");
				Double prod4 = scanner.nextDouble();
				
				System.out.println("Informe o valor do produto 5 :");
				Double prod5 = scanner.nextDouble();
				
				Double subtotal = prod1+prod2+prod3+prod4+prod5;
				Double imposto = subtotal*0.06;
				Double total = subtotal+imposto;
				
				System.out.println("Valor subtotal é de R$: " + subtotal);
				System.out.println("Valor do imposto é de R$: " + imposto);
				System.out.println("Valor total é de R$: " + total);
			}
	
	
	
	
	
			
}
}
