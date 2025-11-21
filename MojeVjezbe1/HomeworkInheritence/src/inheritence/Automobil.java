package inheritence;


	public class Automobil extends Vozilo { 
		private int brojVrata; 
		private int brojOsoba; 
 
		public int getBrojVrata() { 
			return brojVrata; 
		} 

		public void setBrojVrata(int brojVrata) { 
			if (brojVrata > 0) 
				this.brojVrata = brojVrata; 
		} 

		public int getBrojOsoba() { 
			return brojOsoba; 
		} 

		public void setBrojOsoba(int brojOsoba) { 
			if (brojOsoba > 0) 
				this.brojOsoba = brojOsoba; 
		} 

		@Override 
		public float cijenaRegistracije() { 
			float cijena; 
			cijena = ((float)this.getKubikaza()/10 + (2022  - this.getGodiste())*10) *Automobil.getOsnovicaZaRegistraciju(); 
			return cijena; 
		} 

		public Automobil(String marka, String model, int kubikaza, int godiste, int brojVrata, int brojOsoba) { 
			super(marka, model, kubikaza, godiste); 
			this.setBrojVrata(brojVrata); 
			this.setBrojOsoba(brojOsoba); 
		} 

		public Automobil() { 
			this(null, null,0,0,0,0); 
		} 

	@Override 
	public String toString() { 
		return "Automobil [brojVrata=" + brojVrata + ", brojOsoba=" + brojOsoba + ", marka=" + getMarka() + ", model=" + getModel() + ", kubikaza=" + getKubikaza() + ", godiste=" + getGodiste() + "]"; 
	} 
} 