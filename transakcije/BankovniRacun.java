
public class BankovniRacun {

	public static void main(String[] args) {}
		// TODO Auto-generated method stub
		 private String imeVlasnika;
		    private double stanje;

		    // Konstruktor
		    public BankovniRacun(String imeVlasnika, double stanje) {
		        this.imeVlasnika = imeVlasnika;
		        this.stanje = stanje;
		    }

		    // Geteri
		    public String getImeVlasnika() {
		        return imeVlasnika;
		    }
		    public double getStanje() {
		        return stanje;
		    }

		    // Seteri
		    public void setImeVlasnika(String imeVlasnika) {
		        this.imeVlasnika = imeVlasnika;
		    }

		    public void setStanje(double stanje) {
		        this.stanje = stanje;
		    }

		 // Metod za uplatu
		    public void uplati(double iznos) {
		        if (iznos > 0) {
		            stanje += iznos; // Povećava stanje
		        } else {
		            System.out.println("Iznos za uplatu mora biti pozitivan.");
		        }
		    

		    
		    }}