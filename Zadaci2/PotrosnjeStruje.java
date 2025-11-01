import java.util.Scanner;
public class PotrosnjeStruje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
        System.out.print("Unesite broj domaćinstava: "); 
        int N = scanner.nextInt(); 
        int ukupnaPotrosnja = 0; 
        int zbirVecihOd500 = 0; 
        for (int i = 1; i <= N; i++) { 
            System.out.print("Unesite potrošnju za domaćinstvo " + i + " (kWh): "); 
            int potrosnja = scanner.nextInt(); 
            ukupnaPotrosnja += potrosnja; 
            if (potrosnja > 500) { 
                zbirVecihOd500 += potrosnja; 
            } 
        } 
        System.out.println("Ukupna potrošnja svih domaćinstava: " + ukupnaPotrosnja + " kWh"); 
        System.out.println("Zbir potrošnje domaćinstava preko 500 kWh: " + zbirVecihOd500 + " kWh"); 
        
        scanner.close();
            }
	}


