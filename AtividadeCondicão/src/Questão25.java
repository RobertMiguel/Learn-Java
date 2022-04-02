import java.util.Scanner;

public class Questão25 {
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o preço R$:");
		float preco = obter.nextFloat();
		System.out.println("Categoria: 1-Limpeza; 2-Alimentação; 3-Vestuário:");
		float cat = obter.nextFloat();
		System.out.println("Situação: N-Não necessita de refrigeração; R: Necessitão de refrigeração:");
		String sit = obter.next();
		
				
		float pA5 = (float) 0.05;
		float pA8 = (float) 0.08;
		float pA10 = (float) 0.10;
		float pA12 = (float) 0.12;
		float pA15 = (float) 0.15;
		float pA18 = (float) 0.18;
		
		Float preco1, preco2, preco3, preco4, preco5, preco6;
		
		preco1 = preco*pA5;
		preco2 = preco*pA8;
		preco3 = preco*pA10;
		preco4 = preco*pA12;
		preco5 = preco*pA15;
		preco6 = preco*pA18;
		
		Float tl5, tl8, tl10, tl12, tl15, tl18;
		
		tl5 = preco1+preco;
		tl8 = preco2+preco;
		tl10 = preco3+preco;
		tl12 = preco4+preco;
		tl15 = preco5+preco;
		tl18 = preco6+preco;
		
		Float impost5, impost8;
		
		impost5 = (float) (preco*0.05);
		impost8 = (float) (preco*0.08);
		
	
		if(preco  <= 25) {
			if(cat == 1) {
				System.out.println("Percentual de aumento  R$: " + preco1);
				System.out.println("Valor total R$: " + tl5);
			}
			else if(cat == 2) {
				System.out.println("Percentual de aumento R$: " + preco2);
				System.out.println("Valor total R$: " + tl8);
			}
			else if(cat == 3) {
				System.out.println("Percentual de aumento R$: " + preco3);
				System.out.println("Valor total R$: " + tl10);
		}
	}
		else if(preco > 25) {
			
			if(cat == 1) {
				System.out.println("Percentual de aumento R$: " + preco4);
				System.out.println("Valor total R$: " + tl12);
			}
			else if(cat == 2) {
				System.out.println("Percentual de aumento R$: " + preco5);
				System.out.println("Valor total R$: " + tl15);
			}
			else if(cat == 3) {
				System.out.println("Percentual de aumento R$: " + preco6);
				System.out.println("Valor total R$: " + tl18);
			}
		}
		else if(obter.equals(sit  == "R")) {
			System.out.println("Imposto de R$: " + impost5);
			System.out.println("Valor total R$: " + (impost5+preco));
		}
		else if(obter.equals(sit == "N")){
			System.out.println("Imposto de R$: " + impost8);
			System.out.println("Valor total R$: " + (preco+impost8));
		}
		obter.close();
	}
}
