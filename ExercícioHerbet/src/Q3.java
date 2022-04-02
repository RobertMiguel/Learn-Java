import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		try (Scanner obter = new Scanner(System.in)) {
			System.out.println("Nome :");
			String nome = obter.nextLine();
			System.out.println("Rua :");
			String rua = obter.nextLine();	
			System.out.println("Número da residência :");
			int res = obter.nextInt();	
			System.out.println("Estado :");
			String est = obter.next();	
			System.out.println("Cidade :");
			String cid = obter.next();
			System.out.println("CEP (só os números) :");
			int numCEP = obter.nextInt();
			System.out.println("Número para contato :");
			int tel = obter.nextInt();
			System.out.println("Área de atuação profissional :");
			String prof = obter.next();
			System.out.println(nome);
			System.out.println(rua+" N°: "+res+","+cid+","+est+" CEP:"+numCEP);
			System.out.println(tel);
			System.out.println(prof);
		}
		
 }
}
