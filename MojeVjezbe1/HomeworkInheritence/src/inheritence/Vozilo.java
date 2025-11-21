package inheritence;

public abstract class  Vozilo {
	
	private String marka;															//atributi
	private String model;
	private int kubikaza;
	private int godiste;
	private static float osnovicaZaRegistraciju;									//staticka promenljiva
	
																					//inspektori i mutatori(geteri&seteri)
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}
	public static float getOsnovicaZaRegistraciju() {
		return osnovicaZaRegistraciju;
	}
	public static void setOsnovicaZaRegistraciju(float osnovicaZaRegistraciju) {
		Vozilo.osnovicaZaRegistraciju = osnovicaZaRegistraciju;
	}
	
	
	private Vozilo() {                                             							//bezparametarski konstruktor
		this(null, null, 0,0);
	}
	
	
	public Vozilo(String marka, String model, int kubikaza, int godiste) {                 	  //Parametarski konstruktor:
		super();
		this.marka = marka;
		this.model = model;
		this.kubikaza = kubikaza;
		this.godiste = godiste;
	}

	//Metoda za izračunavanje cene registracije:
	//Ova metoda je apstraktna, što znači da će svaka podklasa (Automobil, Motocikl, Kamion) morati da implementira svoju verziju ove metode.
	
	
	public abstract float cijenaRegistracije();
		
	
	@Override
	public String toString() {
		return "Vozilo [marka=" + marka + ", model=" + model + ", kubikaza=" + kubikaza + ", godiste=" + godiste + "]";
	}
		  
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
