// Prvi zadatak
// precrtati metodu - override (koristimo uz @) - to radimo da bismo skratili i prilagodili specificnoj situaciji//

public class Auto {
	public String marka;
	public int godisteAuta;
	public double snagaMotora;
	public boolean prodat;
	public int kubikazaMotora;
	public boolean registrovan;
	private static int brojProdatih = 0;
	
	//konstruktori
	public Auto(String marka, int godisteAuta, double snagaMotora, boolean prodat, int kubikazaMotora,
			boolean registrovan) {
		super();
		this.marka = marka;
		this.godisteAuta = godisteAuta;
		this.snagaMotora = snagaMotora;
		this.prodat = prodat;
		this.kubikazaMotora = kubikazaMotora;
		this.registrovan = godisteAuta < 1985 ? false :  registrovan;}
		
		
	
//getteri i setteri
	
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getGodisteAuta() {
		return godisteAuta;
	}

	public void setGodisteAuta(int godisteAuta) {
		this.godisteAuta = godisteAuta;
	}

	public double getSnagaMotora() {
		return snagaMotora;
	}

	public void setSnagaMotora(int snagaMotora) {
		this.snagaMotora = snagaMotora;
	}

	public boolean isProdat() {
		return prodat;
	}

	public void setProdat(boolean prodat) {
		this.prodat = prodat;
	}

	public int getKubikazaMotora() {
		return kubikazaMotora;
	}

	public void setKubikazaMotora(int kubikazaMotora) {
		this.kubikazaMotora = kubikazaMotora;
	}

	public boolean isRegistrovan() {
		return registrovan;
	}

	public void setRegistrovan(boolean registrovan) {
		this.registrovan = registrovan;
	}
	
	public static int getBroj() {return brojProdatih;}
	
	//... Poslovna logika za JEDAN auto//
	public boolean mozeSeRegistrovati() {
		return godisteAuta >= 1985;
	}
	
	
	
	
	
	

}
