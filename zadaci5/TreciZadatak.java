/* Dat je string u kojem se neka dva uzastopna slova ponavljaju. Pronaci koja su to slova.*/

import java.util.Scanner;

public class TreciZadatak {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String rijec = sc.nextLine();
		
		boolean nadjeno = false;
		
		for (int = 0; i<rijec.length()-1; i++) {
			
			if(rijec.charAt(i)==rijec.charAt(i+1)) {
				System.out.println("Nasli smo ista dva slova u rijeci i to: " + rijec.charAt(i) + "na poziciji" + (i+1));
				nadjeno = true;
			}
			else {
				System.out.println("Nema dva ista slova");
		
			}
			
			if (!nadjeno) {
				System.out.println("Nema povezanih slova");
			}
		}
		
		
		
	}

}
