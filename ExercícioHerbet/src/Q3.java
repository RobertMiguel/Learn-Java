import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		try (Scanner obter = new Scanner(System.in)) {
			System.out.println("Nome :");
			String nome = obter.nextLine();
			System.out.println("Rua :");
			String rua = obter.nextLine();	
			System.out.println("N?mero da resid?ncia :");
			int res = obter.nextInt();	
			System.out.println("Estado :");
			String est = obter.next();	
			System.out.println("Cidade :");
			String cid = obter.next();
			System.out.println("CEP (s? os n?meros) :");
			int numCEP = obter.nextInt();
			System.out.println("N?mero para contato :");
			int tel = obter.nextInt();
			System.out.println("?rea de atua??o profissional :");
			String prof = obter.next();
			System.out.println(nome);
			System.out.println(rua+" N?: "+res+","+cid+","+est+" CEP:"+numCEP);
			System.out.println(tel);
			System.out.println(prof);
		}
		
 }
}
