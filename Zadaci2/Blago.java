import java.util.Scanner;
public class Blago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        // Unos koordinata hrasta
	        System.out.print("Unesite koordinate starog hrasta (x1, y1): ");
	        double x1 = scanner.nextDouble();
	        double y1 = scanner.nextDouble();
	        
	        // Unos koordinata kuće
	        System.out.print("Unesite koordinate stare kuće (x2, y2): ");
	        double x2 = scanner.nextDouble();
	        double y2 = scanner.nextDouble();
	        
	     // Računanje koordinata blaga
	        double x3 = x2 + 2; // Blago je desno od kuće
	        double y3 = y2 - 3; // Blago je ispod kuće
	        
	        // Računanje vazdušnog rastojanja od hrasta do blaga
	        double rastojanjeVazdušno = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
	        
	     // Računanje rastojanja od hrasta do kuće i od kuće do blaga
	        double rastojanjeHrastaDoKuće = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	        double rastojanjeKućeDoBlaga = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
	        
	        // Ukupno rastojanje kada se obiđe kuća
	        double rastojanjeObići = rastojanjeHrastaDoKuće + rastojanjeKućeDoBlaga;
	        
	        // Ispis rezultata
	        System.out.println("Koordinate blaga su: (" + x3 + ", " + y3 + ")");
	        System.out.println("Vazdušno rastojanje od hrasta do blaga je: " + rastojanjeVazdušno);
	        System.out.println("Rastojanje od hrasta do blaga (obići kuću) je: " + rastojanjeObići);
	        
	        // Zatvaranje skenera
	        scanner.close();
	}

}
