import java.util.Scanner;

public class Prova6 {

	public static void main(String[] args) {
			
		Scanner obter = new Scanner (System.in);
			
		System.out.println("Digite o nome : " );
		String nome = obter.next();
	    for (char letra : nome.toCharArray()) {
	        if (Character.isUpperCase(letra)) {
	            nome += letra;
	            
	            System.out.println("resultado: "+ letra);
		
	       obter.close();
	        
	        }
		}
	}
}
