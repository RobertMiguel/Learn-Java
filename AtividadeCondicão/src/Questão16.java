import java.util.Scanner;

public class Questão16 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Preço do produto R$:");
		Double preco = obter.nextDouble();
		System.out.println("Digite o código do produto:");
		Double cod = obter.nextDouble();
		
		String semDesc = "Sem desconto";
		Double desc10 = 0.10;
		Double desc15 = 0.15;
		
		Double vl10, vl15;
		
		Double vlDesc10, vlDesc15;
		
		if(preco <= 30) {
			System.out.println("Produto : " + cod + " " + semDesc);
			System.out.println("Valor atual R$: " + preco);
		}
		if((preco >= 31)&&(preco < 100)) {
			vlDesc10 = preco*desc10;
			vl10 = preco-vlDesc10;
			System.out.println("Produto : " + cod + " desconto de R$: " + vlDesc10);
			System.out.println("Valor atual R$: " + vl10);
		}
		if(preco > 100) {
			vlDesc15 = preco*desc15;
			vl15 = preco-vlDesc15;
			System.out.println("Produto : " + cod + " desconto de R$: " + vlDesc15);
			System.out.println("Valor atual R$: " + vl15);
		}
		obter.close();

	}

}
