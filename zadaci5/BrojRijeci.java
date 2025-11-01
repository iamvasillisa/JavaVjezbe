/*Unijeti recenicu koja sadrzi vise rijeci odvojenih prazninama i odrediti broj rijeci.*/
// odvajamo reci preko metode TRIM/SPLIT//
// regularni izrazi(space, double space) REGEX
//obrada teksta, simboli...
//(A-Z) sva velika slova od A do Z


import java.util.Scanner;

public class BrojRijeci {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		line = line.trim();
		
		
		line.split("\\s+");
		
		String[] djelovi = line.split("\\s+");
		
		
		System.out.println(djelovi.length);
		

	}
}
