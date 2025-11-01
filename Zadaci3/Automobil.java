
public class Automobil {

	public static void main(String[] args) {}
		// TODO Auto-generated method stub
		private String marka;
	    private String model;
	    private int godiste;
	    private int brzina;
	
	    // Konstruktor
	    public Automobil(String marka, String model, int godiste) {
	        this.marka = marka;
	        this.model = model;
	        this.godiste = godiste;
	        this.brzina = 0; // Početna brzina je 0
	    }

	    // Geteri
	    public String getMarka() {
	        return marka;
	    }
	    public String getModel() {
	        return model;
	    }

	    public int getGodiste() {
	        return godiste;
	    }

	    public int getBrzina() {
	        return brzina;
	    }

	    // Seteri
	    public void setMarka(String marka) {
	        this.marka = marka;
	    }
	    
	    public void setModel(String model) {
	        this.model = model;
	    }

	    public void setGodiste(int godiste) {
	        this.godiste = godiste;
	    }

	    // Metod za ubrzanje
	    public void ubrzaj(int vrijednost) {
	        if (brzina + vrijednost > 200) {
	            brzina = 200; // Ne dozvoljava prelaženje 200
	        } else {
	            brzina += vrijednost;
	        }
	    }
	 // Metod za usporavanje
	    public void uspori(int vrijednost) {
	        if (brzina - vrijednost < 0) {
	            brzina = 0; // Ne dozvoljava pad ispod 0
	        } else {
	            brzina -= vrijednost;
	        }
	    }

	    // Metod za ispis podataka o automobilu
	    public void ispisi() {
	        System.out.println("Marka: " + marka);
	        System.out.println("Model: " + model);
	        System.out.println("Godiste: " + godiste);
	        System.out.println("Brzina: " + brzina + " km/h");
	    }}

	    
	