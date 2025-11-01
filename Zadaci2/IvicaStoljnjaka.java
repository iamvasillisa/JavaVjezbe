import java.util.Scanner;
public class IvicaStoljnjaka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
        
        // Unos površine
        System.out.print("Unesite površinu P: ");
        double P = scanner.nextDouble();
        
        // Računanje poluprečnika
        double r = Math.sqrt(P / Math.PI);
        
        // Računanje obima
        double obim = 2 * Math.PI * r;
        	
     // Ispis rezultata
        System.out.println("Potrebna dužina trake za ivicu stoljnjaka je: " + obim);
        
        // Zatvaranje skenera
        scanner.close();
    }

	}


