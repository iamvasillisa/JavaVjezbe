import java.util.Scanner;
public class NarcissisticNnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in); 
	        System.out.print("Unesite broj: "); 
	        int n = scanner.nextInt(); 
	        String brojStr = String.valueOf(n); 
	        int brojCifara = brojStr.length(); 
	        int suma = 0; 
	        int temp = n; 
	        while (temp > 0) { 
	            int cifra = temp % 10; 
	            suma += Math.pow(cifra, brojCifara); 
	            temp /= 10; 
	        } 
	        if (suma == n) { 
	            System.out.println("Da"); 
	        } else { 
	            System.out.println("Ne"); 
	            
	            scanner.close();
	        } 
	    } 
	
	}


