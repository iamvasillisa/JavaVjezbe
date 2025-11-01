import java.util.Scanner;
public class ZavjesaProzor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// Unos koordinata zavjese
        System.out.println("Unesite koordinate gornje lijeve tačke zavjese (x1, y1): ");
        double x1Zavjese = scanner.nextDouble();
        double y1Zavjese = scanner.nextDouble();
        
        System.out.println("Unesite koordinate donje desne tačke zavjese (x2, y2): ");
        double x2Zavjese = scanner.nextDouble();
        double y2Zavjese = scanner.nextDouble();
        
        // Unos koordinata prozora
        System.out.println("Unesite koordinate gornje lijeve tačke prozora (x1, y1): ");
        double x1Prozora = scanner.nextDouble();
        double y1Prozora = scanner.nextDouble();
        
        System.out.println("Unesite koordinate donje desne tačke prozora (x2, y2): ");
        double x2Prozora = scanner.nextDouble();
        double y2Prozora = scanner.nextDouble();
        
     // Provera da li zavjesa prekriva prozor
        boolean pokriva = (x1Zavjese <= x1Prozora) && (y1Zavjese >= y1Prozora) && (x2Zavjese >= x2Prozora) && (y2Zavjese <= y2Prozora);
        
     // Ispis rezultata
        if (pokriva) {
            System.out.println("Zavjesa pokriva prozor.");
        } else {
            System.out.println("Zavjesa ne pokriva prozor.");
        }
        
        // Zatvaranje skenera
        scanner.close();
    }

}


