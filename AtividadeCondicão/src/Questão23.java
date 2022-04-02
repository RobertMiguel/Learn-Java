import java.util.Scanner;

public class Questão23 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o código do produto comprado:");
		Integer cod = obter.nextInt();
		System.out.println("Digite a quantidade comprada do produto:");
		Integer quantProduto = obter.nextInt();
		
		Double preco10 = 10.0;
		Double preco15 = 15.0;
		Double preco20 = 20.0;
		Double preco30 = 30.0;
		
		Double descont250 = 0.05;
		Double descont250_500 = 0.10;
		Double descont500 = 0.15;
		
		Double precoUni01,precoUni02,precoUni03,precoUni04,precoTotal01,precoTotal02,precoTotal03,precoTotal04,precoFinal, vlDescont250,vlDescont250_500, vlDescont500;
		
		if((cod >= 1) && (cod <= 10 )) {
			precoUni01 = quantProduto*preco10;
			System.out.println("Preço unitário comprado R$: " + precoUni01);
			if(precoUni01 <= 250) {
				vlDescont250 = precoUni01*descont250;
				precoTotal01 = precoUni01-vlDescont250;
				System.out.println("Valor do desconto R$: " + vlDescont250);
				System.out.println("Preço total R$: " + precoTotal01);
			}
			if((precoUni01 >=250) && (precoUni01 <= 500)) {
				vlDescont250_500 = precoUni01*descont500;
				precoTotal02 = precoUni01-vlDescont250_500;
				System.out.println("Valor do desconto R$: " + vlDescont250_500);
				System.out.println("Preço total R$: " + precoTotal02);
			}
			if(precoUni01 > 500) {
				vlDescont500 = precoUni01*descont500;
				precoTotal03 = precoUni01-vlDescont500;
				System.out.println("Valor do desconto R$: " + vlDescont500);
				System.out.println("Preço total R$: " + precoTotal03);
			}
		}
		else if((cod >= 11) && (cod <= 20)) {
			precoUni02 = quantProduto*preco15;
			System.out.println("Preço unitário R$: " + precoUni02);
			if(precoUni02 <= 250) {
				vlDescont250 = precoUni02*descont250;
				precoTotal01 = precoUni02-vlDescont250;
				System.out.println("Valor do desconto R$: " + vlDescont250);
				System.out.println("Preço total R$: " + precoTotal01);
			}
			if((precoUni02 >=250) && (precoUni02 <= 500)) {
				vlDescont250_500 = precoUni02*descont250_500;
				precoTotal02 = precoUni02-vlDescont250_500;
				System.out.println("Valor do desconto R$: " + vlDescont250_500);
				System.out.println("Preço total R$: " + precoTotal02);
			}
			if(precoUni02 > 500) {
				vlDescont500 = precoUni02*descont500;
				precoTotal03 = precoUni02-vlDescont500;
				System.out.println("Valor do desconto R$: " + vlDescont500);
				System.out.println("Preço total R$: " + precoTotal03);
			}
		}
		else if((cod >= 21) && (cod <= 30)) {
			precoUni03 = quantProduto*preco20;
			System.out.println("Valor unitário R$: " + precoUni03);
			if(precoUni03 <= 250) {
				vlDescont250 = precoUni03*descont250;
				precoTotal01 = precoUni03-vlDescont250;
				System.out.println("Valor do desconto R$: " + vlDescont250);
				System.out.println("Preço total R$: " + precoTotal01);
			}
			if((precoUni03 >=250) && (precoUni03 <= 500)) {
				vlDescont250_500 = precoUni03*descont250_500;
				precoTotal02 = precoUni03-vlDescont250_500;
				System.out.println("Valor do desconto R$: " + vlDescont250_500);
				System.out.println("Preço total R$: " + precoTotal02);
			}
			if(precoUni03 > 500) {
				vlDescont500 = precoUni03*descont500;
				precoTotal03 = precoUni03-vlDescont500;
				System.out.println("Valor do desconto R$: " + vlDescont500);
				System.out.println("Preço total R$: " + precoTotal03);
			}
		}
		else if((cod >=31) && (cod <= 40)) {
			precoUni04 = quantProduto*preco30;
			System.out.println("Preço unitário R$: " + precoUni04);
			if(precoUni04 <= 250) {
				vlDescont250 = precoUni04*descont250;
				precoTotal01 = precoUni04-vlDescont250;
				System.out.println("Valor do desconto R$: " + vlDescont250);
				System.out.println("Preço total R$: " + precoTotal01);
			}
			if((precoUni04 >=250) && (precoUni04 <= 500)) {
				vlDescont250_500 = precoUni04*descont250_500;
				precoTotal02 = precoUni04-vlDescont250_500;
				System.out.println("Valor do desconto R$: " + vlDescont250_500);
				System.out.println("Preço total R$: " + precoTotal02);
			}
			if(precoUni04 > 500) {
				vlDescont500 = precoUni04*descont500;
				precoTotal04 = precoUni04-vlDescont500;
				System.out.println("Valor do desconto R$: " + vlDescont500);
				System.out.println("Preço total R$: " + precoTotal04);
				
		
			}
			}
			obter.close();
			}
		
		}
	


