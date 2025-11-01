public class Transakcija {
    private double iznos;
    private String tip; // "uplata" ili "isplata"
    private String opis;

    // Konstruktor
    public Transakcija(double iznos, String tip, String opis) {
        if (iznos < 0) {
            throw new IllegalArgumentException("Iznos mora biti veći ili jednak 0.");
        }
        this.iznos = iznos;
        this.tip = tip;
        this.opis = opis;
    }
 // Geteri
    public double getIznos() {
        return iznos;
    }

    public String getTip() {
        return tip;
    }

    public String getOpis() {
        return opis;
    }

    // Seteri
    public void setIznos(double iznos) {
        if (iznos >= 0) {
            this.iznos = iznos;
        } else {
            System.out.println("Iznos mora biti veći ili jednak 0.");
        }
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

 // Metod jeUplata
    public boolean jeUplata() {
        return "uplata".equalsIgnoreCase(tip); // Vraća true ako je tip "uplata"
    }
}


