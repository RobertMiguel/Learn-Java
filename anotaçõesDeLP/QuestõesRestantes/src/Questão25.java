import java.util.Scanner;

public class Questão25 {
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o preço do produto R$:");
		Double preco = obter.nextDouble();
		System.out.println("Digite a categoria do produto:");
		Double cat = obter.nextDouble();
		System.out.println("###################################");
		System.out.println("1 - Limpeza; 2 - alimentação; ou 3 vestuário");
		Integer opr = obter.nextInt();
		System.out.println("Digite - Situações: R - produtos que necessitam de refrigeração; e N - produtos que não necessitam de refrigeração");
		String ncounc = obter.next();
		
		
		Double impost5 = 0.05;
		Double impost8 = 0.08;
		
		Double pCI5, pCI8;
		
		Double pA5 = 0.05;
		Double pA8 = 0.08;
		Double pA10 = 0.10;
		Double pA12= 0.12;
		Double pA15 = 0.15;
		Double pA18 = 0.18;
		
		Double vlP5, vlP8, vlP10, vlP12, vlP15, vlP18;
		Double tl5, tl8, tl10, tl12, tl15, tl18;
		
		Double vlSemRefri5, vlSemRefri8;
		
		Double tlSemRefri5, tlSemRefri8;
		
		ncounc = "R";
		ncounc = "N";
		
		if(ncounc == "R") {
		if(preco <= 25) {
			if(cat == 1 ) {
			vlP5 = preco*pA5;
			System.out.println("PERCENTUAL DE AUMENTO R$:" + vlP5);
			tl5 = preco+vlP5;
			System.out.println("VALOR TOTAL R$: " + tl5);
			pCI5 = tl5+(tl5*impost5);
			System.out.println("VALOR COM IMPOSTO R$: " + pCI5);
			}
			if(cat == 2) {
				vlP8 = preco*pA8;
				System.out.println("PERCENTUAL DE AUMENTO R$: " + vlP8);
				tl8 = preco+vlP8;
				System.out.println("VALOR TOTAL R$: " );
				pCI5 = tl8+(tl8*impost5);
				System.out.println("VALOR COM IMPOSTO R$: " + pCI5);
			}
			if(cat == 3) {
				vlP10 = preco*pA10;
				System.out.println("PERCENTUAL DE AUMENTO R$: " + vlP10);
				tl10 = preco+vlP10;
				System.out.println("VALOR TOTAL R$: " + tl10);
				pCI5 = tl10+(tl10*impost5);
				System.out.println("VALOR COM IMPOSTO R$: " + pCI5);
			}
		}
		if(preco > 25) {
			if(cat == 1) {
				vlP12 = preco*pA12;
				System.out.println("PERCENTUAL DE AUMENTO R$: " + 	vlP12);
				tl12 = preco+vlP12;
				System.out.println("VALOR TOTAL R$: " + tl12);
				pCI5 = tl12+(tl12*impost5);
				System.out.println("VALOR COM IMPOSTO R$: " + pCI5);
			}
			if(cat == 2) {
				vlP15 = preco*pA15;
				System.out.println("PERCENTUAL DE AUMENTO R$: " + vlP15);
				tl15 = preco+vlP15;
				System.out.println("VALOR TOTAL R$: " + tl15);
				pCI5 = tl15+(tl15*impost5);
				System.out.println("VALOR COM IMPOSTO R$: " + pCI5);
			}
			if(cat == 3) {
				vlP18 = preco*pA18;
				System.out.println("PERCENTUAL DE AUMENTO R$: " + vlP18);
				tl18 = preco+vlP18;
				System.out.println("VALOR TOTAL R$: " + tl18);
				pCI5 = tl18+(tl18*impost5);
				System.out.println("VALOR COM IMPOSTO R$: " + pCI5);
			}
			}
			if(ncounc == "N") {
				vlSemRefri8 = (preco*impost8);
				System.out.println("VALOR DO IMPOSTO R$: " + vlSemRefri8);
				tlSemRefri8 = preco+vlSemRefri8;
				System.out.println("VALOR TOTAL R$: " + tlSemRefri8);
			}
			}		
	}
}
