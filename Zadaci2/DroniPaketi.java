import java.util.Scanner;
public class DroniPaketi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in); 
	        // Unos koordinata baze (početne pozicije drona) 
	        System.out.print("Unesite koordinate baze (x y): "); 
	        double x = sc.nextDouble(); 
	        double y = sc.nextDouble(); 
	        // Unos broja paketa 
	        System.out.print("Unesite broj paketa N: "); 
	        int N = sc.nextInt(); 
	        double sumaUdaljenosti = 0.0; 
	        // Unos koordinata paketa i računanje udaljenosti 
	        for (int i = 1; i <= N; i++) { 
	            System.out.print("Unesite koordinate paketa " + i + " (xi yi): "); 
	            double xi = sc.nextDouble(); 
	            double yi = sc.nextDouble(); 
	            // Uslov: paket mora biti u prvom kvadrantu 
	            if (xi > 0 && yi > 0) { 
	             double dist = Math.sqrt(Math.pow(xi - x, 2) + Math.pow(yi - 
	y, 2)); 
	             sumaUdaljenosti += dist; 
	            } 
	        } 
	        System.out.println("Ukupna udaljenost do paketa u prvom kvadrantu: " + sumaUdaljenosti);
	        
	        sc.close();
	}}
