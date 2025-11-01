import java.util.Scanner;
public class Pravougaonik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        
		        // Unos dimenzija
		        System.out.print("Unesite dužinu a: ");
		        double a = scanner.nextDouble();
		        
		        System.out.print("Unesite širinu b: ");
		        double b = scanner.nextDouble();
		        
		        // Računanje površine i obima
		        double povrsina = a * b;
		        double obim = 2 * (a + b);
		        
	            // Ispis rezultata
                System.out.println("Površina pravougaonika je: " + povrsina);
                System.out.println("Obim pravougaonika je: " + obim);
    
                 scanner.close();
}

}
