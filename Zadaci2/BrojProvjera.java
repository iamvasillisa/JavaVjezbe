import java.util.Scanner;
public class BrojProvjera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
		// Unos cijelog broja
	        System.out.print("Unesite jedan cijeli broj: ");
	        int broj = scanner.nextInt();
	        
	        // Provera da li je broj pozitivan ili negativan
	        if (broj >= 0) {
	            System.out.print("Broj je pozitivan/");
	        } else {
	            System.out.print("Broj je negativan/");
	        }
	     // Provera da li je broj paran ili neparan
	        if (broj % 2 == 0) {
	            System.out.println("paran.");
	        } else {
	            System.out.println("neparan.");
	        }
	        
	        // Zatvaranje skenera
	        scanner.close();
	        
	}

}
