/* Za data dva stringa provjeriti da li je drugi podstring prvog.*/


import java.util.Scanner;

public class CetvrtiZad {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Unesite prvi string:");
        String prvi = sc.nextLine();
        
        System.out.println("Unesite drugi string:");
        String drugi = sc.nextLine();
        
        // Provjera pomoću if uslova
        if (prvi.contains(drugi)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
		
	}

}
