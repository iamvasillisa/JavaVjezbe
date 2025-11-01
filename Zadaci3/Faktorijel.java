import java.util.Scanner;

public class Faktorijel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long P = 1; // Koristimo long za faktorijal
        int N;
        Scanner u = new Scanner(System.in);

        System.out.print("Unesi prirodan broj N (do 20): ");
        N = u.nextInt();

        if (N < 0) {
            System.out.println("N mora biti prirodan broj (nula ili veći).");
        } else {
            for (int i = 1; i <= N; i++) {
                P *= i; // Množimo P sa i
            }
            System.out.println("Faktorijal broja " + N + " je: " + P);
        }

        u.close(); // Zatvaramo skener da bismo sprečili curenje resursa
    }
}

