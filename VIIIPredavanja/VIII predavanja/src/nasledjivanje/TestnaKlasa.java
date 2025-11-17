package nasledjivanje;

import java.util.ArrayList;

public class TestnaKlasa {
	 public static void main(String[] args) {
	        Vozilo.setOsnovicaZaRegistraciju(10);
	        ArrayList<Vozilo> vozila = new ArrayList<>();

	        vozila.add(new Automobil("Lada", "Niva", 1800, 2000, 5, 5));
	        vozila.add(new Motocikl("Kawasaki", "RT001", 900, 2010, 5000));
	        vozila.add(new Automobil("Citroen", "C3", 1100, 2010, 5, 5));
	        vozila.add(new Automobil("WV", "Golf 5", 1900, 2000, 5, 5));
	        vozila.add(new Kamion("MAN", "TM123", 5000, 2010, 5));

	        float ukupnaCijena = 0;
	        for (Vozilo v : vozila) {
	            ukupnaCijena += v.cijenaRegistracije();
	        }

	        System.out.println("Ukupno za registraciju: " + ukupnaCijena + " EUR");
	    }
}
