import java.util.Scanner;
public class TajnaVrata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner = new Scanner(System.in);
        
     // Unos trocifrenog broja
     System.out.print("Unesite trocifreni broj: ");
     int broj = scanner.nextInt();
     
     // Proveravamo da li je broj trocifren
     if (broj < 100 || broj > 999) {
         System.out.println("Morate uneti trocifreni broj.");
         scanner.close();
         return;
     }
  // Ekstrakcija cifara
     int cifar1 = broj / 100;           // Prva cifra
     int cifar2 = (broj / 10) % 10;     // Druga cifra
     int cifar3 = broj % 10;            // Treća cifra
     
     // Računanje proizvoda cifara
     int proizvodCifara = cifar1 * cifar2 * cifar3;
     
     // Računanje zbira cifara
     int zbir = cifar1 + cifar2 + cifar3;
     
     // Računanje koda
     int kod = proizvodCifara - zbir;
     
  // Ispis rezultata
     System.out.println("Kod koji otvara tajna vrata je: " + kod);
     
     // Zatvaranje skenera
     scanner.close();
     
	}}