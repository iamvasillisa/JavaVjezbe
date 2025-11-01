import java.util.Scanner;
public class KruznaStaza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

		  long N = sc.nextLong(); // broj polja na kružnoj stazi 
	        int T = sc.nextInt();   // broj poteza 
	        long pos = 0;           // start sa polja 0 
	        for (int i = 0; i < T; i++) { 
	            long K = sc.nextLong(); // koliko mjesta ide unaprijed 
	            pos = (pos + K) % N;  // kružno kretanje 
	            System.out.println(pos); // ispiši novo polje 
	        } 
	        // Konačna pozicija: 
	        System.out.println(pos); 
	        
	        sc.close();
	    } 
	} 
	 



