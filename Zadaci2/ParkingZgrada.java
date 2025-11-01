import java.util.Scanner;
public class ParkingZgrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in); 
	        System.out.print("Unesite broj automobila: "); 
	        int N = scanner.nextInt(); 
	        int ukupnaZarada = 0; 
	        for (int i = 1; i <= N; i++) { 
	            System.out.print("Unesite broj sati za auto " + i + ": "); 
	            int sati = scanner.nextInt(); 
	            int cijena; 
	            if (sati <= 5) { 
	                cijena = sati * 2; 
	            } else { 
	                cijena = 5 * 2 + (sati - 5) * 1; 
	            } 
	            ukupnaZarada += cijena; 
	        } 
	        System.out.println("Ukupna zarada parkinga je: " + ukupnaZarada + " €"); 
	        
	        scanner.close();
	    } 
	}


