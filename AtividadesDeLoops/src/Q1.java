import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		Scanner obter = new Scanner (System.in);
		
		int D,n1,n2,n3,n4, gp;
		
		for(D = 1; D<=5;D++) {
			
			System.out.println("Digite o n?mero 1:");
			n1 = obter.nextInt();
			System.out.println("Digite o n?mero 2:");
			n2 = obter.nextInt();
			System.out.println("Digite o n?mero 3:");
			n3 = obter.nextInt();
			System.out.println("Digite o n?mero 4:");
			n4 = obter.nextInt();
			
			if((n1 == n2)|| (n1 ==n3)||(n1 ==n4)||(n2 ==n3)||(n2==n4)) {
				System.out.println("Eles s?o iguais");
			}
			else {
				for(gp = 1; gp <= 1; gp++)
				{
					System.out.println("O" + gp + " o grupo = " + n1+n2+n3+n4);
					
					if((n1 < n2)&&(n2 <n3)&&(n3<n4))
					{
						System.out.println("Os n?meros em ordem crescente s?o: " + n1 + " + " + n2 +" + " + n3 + " + " + n4);
					}
					else if((n1 <n3)&&(n2<n4)&&(n4<n3)){
						System.out.println("Os n?meros em ordem crescente s?o: " + n1 + " + " + n2 +" + " + n4 + " + " + n3);
					} 

			        if ((n1 < n3) && (n3 < n2) && (n2 < n4)) {
			        System.out.println("Os n?meros em ordem crescente s?o: "+ n1+" + "+n3+" + "+n2+ " + "+n4);
			        }
			        if ((n1 < n3) && (n3 < n2) && (n4 < n2)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n1+" + "+n3+" + "+n4+ " + "+n2);
			        }
			        if ((n1 < n4) && (n4 < n2) && (n2 < n3)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n1+" + "+n4+" + "+n2+ " + "+n3);
			        }
			        if ((n1 < n4) && (n4 < n3) && (n3 < n2)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n1+" + "+n4+" + "+n3+ " + "+n2);
			        
			        }
			        
			        if ((n2 < n1) && (n1 < n3) && (n3 < n4)) {
			        	System.out.println ("Os n?meros em ordem crescente s?o: "+ n2+" + "+n1+" + "+n3+ " + "+n4);
			        }
			        	if ((n2 < n1) && (n1 < n4) && (n4 < n3)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n2+" + "+n1+" + "+n4+ " + "+n3);
			        	}
			        if ((n2 < n3) && (n3 < n1) && (n1 < n4)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n2+" + "+n3+" + "+n1+ " + "+n4);
			        }
			        if ((n2 < n3) && (n3 < n4) && (n4 < n1)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n2+" + "+n3+" + "+n4+ " + "+n1);
			        }
			        if ((n2 < n4) && (n4 < n1) && (n1 < n3)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n2+" + "+n4+" + "+n1+ " + "+n3);
			        }
			        if ((n2 < n4) && (n4 < n3) && (n3 < n1)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n2+" + "+n4+" + "+n3+ " + "+n1);
			        }
			        if ((n3 < n1) && (n1 < n2) && (n2 < n4)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n3+" + "+n1+" + "+n2+ " + "+n4);
			        }
			        if ((n3 < n1) && (n1 < n4) && (n4 < n2)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n3+" + "+n1+" + "+n4+ " + "+n2);
			        }
			        if ((n3 < n2) && (n2 < n1) && (n1 < n4)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n3+" + "+n2+" + "+n1+ " + "+n4);
			        }
			        if ((n3 < n2) && (n2 < n4) && (n4 < n1)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n3+" + "+n2+" + "+n4+ " + "+n1);
			        }
			        if ((n3 < n4) && (n4 < n1) && (n1 < n2)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n3+" + "+n4+" + "+n1+ " + "+n2);
			        }
			        if ((n3 < n4) && (n4 < n2) && (n2 < n1)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n3+" + "+n4+" + "+n2+ " + "+n1);
			        }
			        if ((n4 < n1) && (n1 < n2) && (n2 < n3)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n4+" + "+n1+" + "+n2+ " + "+n3);
			        }
			        if ((n4 < n1) && (n1 < n3) && (n3 < n2)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n4+" + "+n1+" + "+n3+ " + "+n2);
			        }
			        if ((n4 < n2) && (n2 < n1) && (n1 < n3)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n4+" + "+n2+" + "+n1+ " + "+n3);
			        }
			        if ((n4 < n2) && (n2 < n3) && (n3 < n1)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n4+" + "+n2+" + "+n3+ " + "+n1);
			        }
			        if ((n4 < n3) && (n3 < n1) && (n1 < n2)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n4+" + "+n3+" + "+n1+ " + "+n2);
			        }
			        if ((n4 < n3) && (n3 < n2) && (n2 < n1)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n4+" + "+n3+" + "+n2+ " + "+n1);
			        }
			        
			        /////////////////////////////////
			        else if((n1 >n3)&&(n2>n4)&&(n4>n3)){
						System.out.println("Os n?meros em ordem crescente s?o: " + n1 + " + " + n2 +" + " + n4 + " + " + n3);
					} 

			        if ((n1 > n3) && (n3 > n2) && (n2 > n4)) {
			        System.out.println("Os n?meros em ordem crescente s?o: "+ n1+" + "+n3+" + "+n2+ " + "+n4);
			        }
			        if ((n1 > n3) && (n3 > n2) && (n4 > n2)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n1+" + "+n3+" + "+n4+ " + "+n2);
			        }
			        if ((n1 > n4) && (n4 > n2) && (n2 > n3)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n1+" + "+n4+" + "+n2+ " + "+n3);
			        }
			        if ((n1 > n4) && (n4 > n3) && (n3 > n2)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n1+" + "+n4+" + "+n3+ " + "+n2);
			        
			        }
			        
			        if ((n2 > n1) && (n1 > n3) && (n3 > n4)) {
			        	System.out.println ("Os n?meros em ordem crescente s?o: "+ n2+" + "+n1+" + "+n3+ " + "+n4);
			        }
			        	if ((n2 > n1) && (n1 > n4) && (n4 > n3)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n2+" + "+n1+" + "+n4+ " + "+n3);
			        	}
			        if ((n2 > n3) && (n3 > n1) && (n1 > n4)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n2+" + "+n3+" + "+n1+ " + "+n4);
			        }
			        if ((n2 > n3) && (n3 > n4) && (n4 > n1)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n2+" + "+n3+" + "+n4+ " + "+n1);
			        }
			        if ((n2 > n4) && (n4 > n1) && (n1 > n3)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n2+" + "+n4+" + "+n1+ " + "+n3);
			        }
			        if ((n2 > n4) && (n4 > n3) && (n3 > n1)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n2+" + "+n4+" + "+n3+ " + "+n1);
			        }
			        if ((n3 > n1) && (n1 > n2) && (n2 > n4)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n3+" + "+n1+" + "+n2+ " + "+n4);
			        }
			        if ((n3 > n1) && (n1 > n4) && (n4 > n2)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n3+" + "+n1+" + "+n4+ " + "+n2);
			        }
			        if ((n3 > n2) && (n2 > n1) && (n1 > n4)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n3+" + "+n2+" + "+n1+ " + "+n4);
			        }
			        if ((n3 > n2) && (n2 > n4) && (n4 > n1)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n3+" + "+n2+" + "+n4+ " + "+n1);
			        }
			        if ((n3 > n4) && (n4 > n1) && (n1 > n2)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n3+" + "+n4+" + "+n1+ " + "+n2);
			        }
			        if ((n3 > n4) && (n4 > n2) && (n2 > n1)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n3+" + "+n4+" + "+n2+ " + "+n1);
			        }
			        if ((n4 > n1) && (n1 > n2) && (n2 > n3)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n4+" + "+n1+" + "+n2+ " + "+n3);
			        }
			        if ((n4 > n1) && (n1 > n3) && (n3 > n2)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n4+" + "+n1+" + "+n3+ " + "+n2);
			        }
			        if ((n4 > n2) && (n2 > n1) && (n1 > n3)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n4+" + "+n2+" + "+n1+ " + "+n3);
			        }
			        if ((n4 > n2) && (n2 > n3) && (n3 > n1)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n4+" + "+n2+" + "+n3+ " + "+n1);
			        }
			        if ((n4 > n3) && (n3 > n1) && (n1 > n2)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n4+" + "+n3+" + "+n1+ " + "+n2);
			        }
			        if ((n4 > n3) && (n3 > n2) && (n2 > n1)) {
			        System.out.println ("Os n?meros em ordem crescente s?o: "+ n4+" + "+n3+" + "+n2+ " + "+n1);
			        }
			        
			        
					{
						
					}
				}
			}
		}	
	}
}
