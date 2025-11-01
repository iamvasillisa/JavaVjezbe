import java.util.Scanner;
public class NasAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, pom; 
		  Scanner u = new Scanner(System.in); 
		  System.out.print("Unesi N: "); 
		  N = u.nextInt(); 
		  pom = N; 
		  if (N<0) N=-N; 
		  System.out.printf("|%d| = %d",pom,N); 
		  
		  u.close();
		 } 
		
	}


