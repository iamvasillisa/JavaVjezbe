package inheritence;

public class Kamion extends Vozilo { 
	 private int nosivost; 
	  
	 public int getNosivost() { 
	  return nosivost; 
	 } 
	 
	 public void setNosivost(int nosivost) { 
	  this.nosivost = nosivost; 
	 } 
	 
	 @Override 
	 public float cijenaRegistracije() { 
	  // TODO Auto-generated method stub 
	  float cijena; 
	  cijena = ((float)this.getKubikaza()/10 + (2022-this.getGodiste())*10) *Kamion.getOsnovicaZaRegistraciju() +30*this.getNosivost(); 
	  return cijena; 
	 } 
	  
	 public Kamion() { 
	  this(null,null,0,0,0); 
	 } 
	 
	 public Kamion(String marka, String model, int kubikaza, int godiste, int nosivost) { 
	  super(marka, model, kubikaza, godiste); 
	  this.setNosivost(nosivost); 
	 } 
	 
	 @Override 
	 public String toString() { 
	  return "Kamion [nosivost=" + getNosivost() + ", marka=" + getMarka() + ", model=" + getModel()  + ", kubikaza=" + getKubikaza() + ", godiste=" + getGodiste() + "]"; 
	 } 
	  
}