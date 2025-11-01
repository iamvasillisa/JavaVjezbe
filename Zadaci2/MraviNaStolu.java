import java.util.Scanner;
public class MraviNaStolu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner (System.in);
    
    // unos koordinata stola 
    System.out.print("Unesite X koordinatu donjeg lijevog tjemena stola: "); 
    int x1 = scanner.nextInt(); 
    System.out.print("Unesite Y koordinatu donjeg lijevog tjemena stola: "); 
    int y1 = scanner.nextInt(); 
    System.out.print("Unesite X koordinatu gornjeg desnog tjemena stola: "); 
    int x2 = scanner.nextInt(); 
    System.out.print("Unesite Y koordinatu gornjeg desnog tjemena stola: "); 
    int y2 = scanner.nextInt(); 
    System.out.print("Unesite broj mrava: "); 
    int n = scanner.nextInt(); 
    int brojNaIvici = 0; 
    System.out.println("Unesite koordinate mrava (x y):"); 
    for (int i = 1; i <= n; i++) { 
        int x = scanner.nextInt(); 
        int y = scanner.nextInt(); 
        // lijeva, desna, donja, gornja 
        boolean naIvici = (x == x1 && y >= y1 && y <= y2) ||   
                          (x == x2 && y >= y1 && y <= y2) ||   
                          (y == y1 && x >= x1 && x <= x2) ||   
                          (y == y2 && x >= x1 && x <= x2);   
        if (naIvici) { 
            brojNaIvici++; 
            System.out.println("Mrav " + i + " je na ivici: (" + x 
+ ", " + y + ")"); 
        } 
    } 
    System.out.println("Ukupno mrava na ivici: " + brojNaIvici); 
    
    scanner.close();
}
	}


