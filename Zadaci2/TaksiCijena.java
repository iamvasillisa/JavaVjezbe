import java.util.Scanner;
public class TaksiCijena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        // Definisanje cena
	        double pocetnaCijena = 1.0; // Početna cena
	        double cijenaPoKilometru = 0.5; // Cena po kilometru
	        
	        // Unos broja pređenih kilometara
	        System.out.print("Unesite broj pređenih kilometara: ");
	        double kilometri = scanner.nextDouble();
	        
	        // Računanje ukupne cene vožnje
	        double ukupnaCijena = pocetnaCijena + (kilometri * cijenaPoKilometru);
	        
	     // Ispis rezultata
	        System.out.println("Ukupna cijena vožnje je: " + ukupnaCijena + " eura");
	        
	        // Zatvaranje skenera
	        scanner.close();
	    }
	}


