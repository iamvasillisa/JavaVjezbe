import java.util.Scanner;
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
        
        // Unos cijelog broja N
        System.out.print("Unesite cijeli broj N: ");
        int N = scanner.nextInt();
        
        // Provera uslova i ispis poruke
        if (N % 3 == 0 && N % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (N % 3 == 0) {
            System.out.println("Buzz");
        } else if (N % 5 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(N);
        }
        
        // Zatvaranje skenera
        scanner.close();
	}

}
