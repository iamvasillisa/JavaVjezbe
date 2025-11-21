package inheritence;


	import java.io.File; 
	import java.io.FileNotFoundException; 
	import java.util.ArrayList; 
	import java.util.Scanner; 

	public class TestnaKlasa { 

		public static void main(String[] args) throws FileNotFoundException { 
  
  
			Vozilo.setOsnovicaZaRegistraciju(10); 
			Vozilo niz[] = new Vozilo[5]; 
  
			niz[0] = new Automobil("Lada","Niva",1800,2000,5,5); 
			niz[1] = new Motocikl("Kawasaki","RT001",900,2010,5000); 
			niz[2] = new Automobil("Citroen","C3",1100,2010,5,5); 
			niz[3] = new Automobil("WV","Golf 5",1900,2000,5,5); 
			niz[4] = new Kamion("MAN","TM123",5000,2010,5); 
  
			float ukupnaCijena = 0; 
			for(Vozilo v: niz) 
				ukupnaCijena += v.cijenaRegistracije(); 
  
			System.out.println("Ukupno za registraciju: " +  ukupnaCijena + " EUR"); 
    
 /* Primjer ucitavanja podataka iz fajla 
 File f = new File("Automobili"); 
 Scanner u = new Scanner(f); 
  
 ArrayList <Vozilo> niz = new ArrayList<Vozilo>(); 
  
 while(u.hasNextLine()) { 
  niz.add(new Automobil( 
     u.next(), 
     u.next(), 
     u.nextInt(), 
     u.nextInt(), 
     u.nextInt(), 
     u.nextInt() 
    ) 
  ); 
 } 
  
 for(Vozilo v:niz) 
  System.out.println(v);  
 */ 
 
} 

} 
