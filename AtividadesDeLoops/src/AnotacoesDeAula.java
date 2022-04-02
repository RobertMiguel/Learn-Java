
public class AnotacoesDeAula {
	public static void main(String[] args) {
		
		//IMPRIMINDO EM FORMA CRESCENTE
		
		// While (enquanto)
		// While (<condição>) {}
		//1 ... 100
		
		int contador = 10;
		
		while(contador <= 100){
			System.out.println(contador);
			contador++;
		}
		
		// Usando uma string "Ola"
		
		int cont = 0;
		
		while(cont <= 3) {
			System.out.println("Olá");
			cont++;
		}
		
		//50 .. 80
		
		int cinq = 50;
		
		while(cinq <=80) {
			System.out.println(cinq);
			cinq++;
		}
		
		//Encremetando de 2 em 2 ...
		
		int doisEmdois = 10;
		
		while(doisEmdois < 50) {
			System.out.println(doisEmdois);
			doisEmdois+=2; //doisEmdois = doisEmdois+2;
		}
		
		//IMPRIMINDO EM FORMA DECRESCENTE
		
		//400 300
		
		int quarto = 400;
		
		while(quarto >= 300) {
			System.out.println(quarto);
			//quarto = quarto-1;
			//quarto-=1;
			quarto--;
		}
		
		//Do-while
		
		int conta = 299;
		do {
			System.out.println(conta);
			conta--;
		}while(conta >= 300);
		
	
		// for(valor inicial; condicao;<pass>) {}
		//1...100	
		for(int contad =1;contad <100;contad++) {
			System.out.println(contad);
		}
		
	}
	}

