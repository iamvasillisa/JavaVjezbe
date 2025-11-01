import java.util.Scanner;
public class Funkcija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x; 
		  float f = 0; 
		  Scanner u = new Scanner(System.in); 
		  System.out.print("Unesi x: "); 
		  x = u.nextInt(); 
		  if (x < 1) f = x*x; 
		  else 
		   if (x>= 1 & x<5) 
		    f = 2-x; 
		   else if(x>=5) 
		    f = (float)(x*x*x-1)/5; 
		  System.out.printf("f(%d) = %.2f",x,f);
		  
		  u.close();
	}

}
