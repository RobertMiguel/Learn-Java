import java.util.Scanner;

public class Quest?o20 {

	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		Double cateto01, cateto02, hipotenusa ;
		
		System.out.println("Medida do ch?o at? a ponta de escada:");
		cateto01 = obter.nextDouble();
		System.out.println("Medida da escada at? o final da parede:");
		cateto02 = obter.nextDouble();
		
		hipotenusa = Math.sqrt(Math.pow(cateto01, 2)+Math.pow(cateto02, 2));
		System.out.println("Medida da escada at? alcan?ar a ponta: " + hipotenusa);
		
		if(hipotenusa < 0){
			 hipotenusa = hipotenusa * (-1);
		}
		
		obter.close();
		
}
}


