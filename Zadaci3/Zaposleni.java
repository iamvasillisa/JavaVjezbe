
public class Zaposleni {
	
	  // Atributi 
    private String ime; 
    private String prezime; 
    private int godineStaza; 
    private double plata; 
    // Konstruktor 
    public Zaposleni(String ime, String prezime, int godineStaza, 
double plata) { 
        this.ime = ime; 
        this.prezime = prezime; 
        this.godineStaza = godineStaza; 
        this.plata = plata; 
    } 
    // Getteri 
    public String getIme() { return ime; } 
    public String getPrezime() { return prezime; } 
    public int getGodineStaza() { return godineStaza; } 
    public double getPlata() { return plata; } 
    // Setteri 
    public void setIme(String ime) {  
          this.ime = ime;  
    } 
 
 
    public void setPrezime(String prezime) {  
          this.prezime = prezime;  
    } 
    public void setGodineStaza(int godineStaza) { 
        if (godineStaza >= 0) this.godineStaza = godineStaza; 
        else { 
          System.out.println("Godine ne mogu biti negativne.");} 
    } 
    public void setPlata(double plata) { 
        if (plata >= 0) this.plata = plata; 
        else System.out.println("Plata ne može biti negativna."); 
    } 
    // Ispis zaposlenog 
    public void ispisi() { 
        System.out.println(ime + " " + prezime + ", godine staža: " + 
godineStaza + ", plata: " + plata); 
    } 
 
    // Pravilo: ako je plata < 800 i staž > 10, povećaj 6% 
    public void provjeriIPovecajPlatuAkoTreba() { 
        if (plata < 800 && godineStaza > 10) { 
            double stara = plata; 
            plata = plata * 1.06; 
            System.out.println(ime + " " + prezime + ": plata povećana sa " + stara + " na " + plata); 
        } 
    } 
    // Testiranje 
    public static void main(String[] args) { 
        Zaposleni z1 = new Zaposleni("Ana", "Markovic", 5, 750); 
        Zaposleni z2 = new Zaposleni("Marko", "Jovanovic", 12, 790); 
 
        // Ispis početnih vrijednosti 
        z1.ispisi(); 
        z2.ispisi(); 
        // Test settera 
        z1.setPlata(770); 
        z2.setGodineStaza(15); 
        // Primjena pravila za povećanje 
        z1.provjeriIPovecajPlatuAkoTreba(); 
        z2.provjeriIPovecajPlatuAkoTreba(); 
        // Ispis poslije promjena 
        z1.ispisi(); 
        z2.ispisi(); 
    }}