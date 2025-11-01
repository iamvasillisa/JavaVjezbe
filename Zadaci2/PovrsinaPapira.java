import java.util.Scanner;
public class PovrsinaPapira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	        
	        // Unos dimenzija u milimetrima
	        System.out.print("Unesite širinu lista papira (u mm): ");
	        double sirinaMM = scanner.nextDouble();
	        
	        System.out.print("Unesite visinu lista papira (u mm): ");
	        double visinaMM = scanner.nextDouble();
	        
	        // Konverzija milimetara u centimetre
	        double sirinaCM = sirinaMM / 10;
	        double visinaCM = visinaMM / 10;
	        
	        // Računanje površine u kvadratnim centimetrima
	        double povrsinaCM2 = sirinaCM * visinaCM;
	        
	     // Ispis rezultata
	        System.out.println("Površina lista papira je: " + povrsinaCM2 + " kvadratnih centimetara.");
	        
	        scanner.close();
	}}

