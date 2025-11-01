
public enum Studenti {
	
	//--- Konstante (5 Studenata sa ocenama iz 3 predmeta)---
	PETAR_PETROVIC(8,9,10),
	MILICA_MILIC(9,9,8),
	IVAN_IVANOVIC(10, 10, 9),
	JOVANA_JOVANOVIC(7,8,8),
	MARKO_MARKOVIC(6,7,8),
	
	//---ATRIBUTI---
	private final int ocjena1;
	private final int ocjena2;
	private final int ocjena3;
	
	//---Konstruktor
	Studenti(int ocjena1, int ocjena2, int ocjena3) {
		this.ocjena1 = ocjena1;
		this.ocjena2 = ocjena2;
		this.ocjena3 = ocjena3;
	}
	
	//-- Metoda za racunanje prosjeka---/
	public double prosjek() {
		return (ocjena1 + ocjena2 + ocjena3) / 3.0;
	}
	
	//---Lijepo formatiran prikaz---
	@Override 
	public String toString() {
		//zamjenjujemo
	}

	

}
