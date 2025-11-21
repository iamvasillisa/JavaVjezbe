package inheritence;


	public class Motocikl extends Vozilo { 
		private int kilometraza; 
 
		public int getKilometraza() { 
			return kilometraza; 
		} 

		public void setKilometraza(int kilometraza) { 
			this.kilometraza = kilometraza; 
		} 

		@Override 
		public float cijenaRegistracije() { 
			// TODO Auto-generated method stub 
			float cijena; 
			cijena = ((float)this.getKubikaza()/5 - (float)this.getKilometraza()/1000)  *Motocikl.getOsnovicaZaRegistraciju(); 
			return cijena; 
		} 
 
		public Motocikl() { 
			this(null,null,0,0,0); 
		} 

		public Motocikl(String marka, String model, int kubikaza, int godiste, int kilometraza) { 
			super(marka, model, kubikaza, godiste); 
			this.setKilometraza(kilometraza); 
		} 

		@Override 
		public String toString() { 
			return "Motocikl [kilometraza=" + getKilometraza() + ", marka=" + getMarka() + ", model="  + getModel() + ", kubikaza=" + getKubikaza() + ", godiste=" + getGodiste() + "]"; 
		} 

}