import java.util.Scanner;
public class Zid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        
	        // Unos koordinata
	        System.out.print("Unesite koordinate gornje leve tačke (x1, y1): ");
	        double x1 = scanner.nextDouble();
	        double y1 = scanner.nextDouble();
	        
	        System.out.print("Unesite koordinate donje desne tačke (x2, y2): ");
	        double x2 = scanner.nextDouble();
	        double y2 = scanner.nextDouble();
	        
	        // Računanje širine i visine
	        double sirina = x2 - x1;
	        double visina = y1 - y2;
	        
	        // Računanje površine i obima
	        double povrsina = sirina * visina;
	        double obim = 2 * (sirina + visina);
	        
	        // Ispis rezultata
	        System.out.println("Površina zida je: " + povrsina);
	        System.out.println("Obim zida je: " + obim);
	        
	        // Zatvaranje skenera
	        scanner.close();
	    }
	
	}


