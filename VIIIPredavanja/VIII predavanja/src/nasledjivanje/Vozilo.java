package nasledjivanje;

public abstract class Vozilo {
	
	 private String marka; 
	 private String model; 
	 private int kubikaza; 
	 private int godiste; 
	 private static float osnovicaZaRegistraciju; 
	  
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
	  
	 public Vozilo() { 
	  this(null, null, 0, 0); 
	 } 
	 public Vozilo(String marka, String model, int kubikaza, int godiste) {
	        this.setMarka(marka);
	        this.setModel(model);
	        this.setKubikaza(kubikaza);
	        this.setGodiste(godiste);
	    }

	    public abstract float cijenaRegistracije();

	    @Override
	    public String toString() {
	        return "Vozilo [marka=" + marka + ", model=" + model + ", kubikaza=" + kubikaza + ", godiste=" + godiste + "]";
	    }
	}


