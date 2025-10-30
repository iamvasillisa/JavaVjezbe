
public class Test {

	public static void main(String[] args) {
		Automobil bembara = new Automobil("Porsche", "braon", 2015, 4500, 6, "SU744T4");
		Kamion kamion1 = new Kamion("Opel", "Plavi", 2020, 12000, 4000, true);
		Kombi kombi1 = new Kombi("Golf", "Bijeli", 2012, 2300, 7);
		
        System.out.println(bembara);
        System.out.printf("Cijena registracije: %.2f EUR%n%n", bembara.odrediCijenu());
        
        System.out.println(kamion1);
        System.out.printf("Cijena registracije: %.2f EUR%n%n", kamion1.odrediCijenu());
        
        System.out.println(kombi1);
        System.out.printf("Cijena registracije: %.2f EUR%n", kombi1.odrediCijenu());
		
	}

}
