import java.util.Scanner;

public class Rascunho{

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		System.out.println("Digite o nome : ");
		String nome = obter.next();
	    String primeiraLetraNomeSobrenome = "";
	    for (char letra : nome.toCharArray()) {
	        if (Character.isUpperCase(letra)) {
	            primeiraLetraNomeSobrenome += letra;
	        }
	    }
	    System.out.println("resultado: "+ primeiraLetraNomeSobrenome);
	    obter.close();
	}

}
