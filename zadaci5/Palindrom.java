/*Provjeriti da li je unesena rijec palindrom.*/
/* koristiti StringBuilder i metod reverse()*/
//Sta se desava ako imamo spaces u stringu



import java.util.Scanner;
public class Palindrom {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite rijec za koju zelite provjeriti da li je palindrom: ");
		
		String x = sc.nextLine().trim();
		
		String y = new StringBuilder(x).reverse().toString();
		
		if (x.equalsIgnoreCase(y)) {
			System.out.println("JESTE POLINDROM");
			
		}
		else {
			System.out.println("NIJE PALINDROM");
		}

	}

}
