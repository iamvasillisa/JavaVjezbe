public class App {
    public static void main(String[] args) {
        // Kreiramo bankovni račun
        BankovniRacun racun = new BankovniRacun("Marko Marković", 10000.00);

        // Kreiramo transakcije
        Transakcija uplata = new Transakcija(2500.00, "uplata", "Uplata na račun");
        Transakcija isplata = new Transakcija(5000.00, "isplata", "Isplata sa računa");

        // Izvršavamo transakcije na osnovu tipa
        if (uplata.jeUplata()) {
            racun.uplati(uplata.getIznos());
        }

        if (!isplata.jeUplata()) {
            racun.uplati(isplata.getIznos());
        }
     
    }
}

